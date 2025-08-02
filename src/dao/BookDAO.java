package dao;

import models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
    private Connection conn;
    public BookDAO() throws SQLException, ClassNotFoundException {
        this.conn = DatabaseConnection.connect();
    }
    public void insertBook(Book book){
        try {
            String query = "INSERT INTO book" +
                    "(bookNumber, bookName, authorName, bookquantity) " +
                    "VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,book.getBookNumber());
            ps.setString(2, book.getBookName());
            ps.setString(3, book.getBookAuthor());
            ps.setInt(4,book.getBookQuantity());
            if(ps.executeUpdate() > 0){
                System.out.println("book added to database");
            }else{
                System.out.println("Failed to add");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void updateBookDetail(int bookid, int bookNumber) {
        try {
                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,bookNumber);
                ps.setInt(2, bookid);
                if(ps.executeUpdate() > 0){
                    System.out.println("book updated");
                }else{
                    System.out.println("Failed to update");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    public void deleteBookDetail(int bookid) {
        try {
            String query = "DELETE FROM book WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookid);
            if (ps.executeUpdate() > 0) {
                System.out.println("book deleted");
            } else {
                System.out.println("Failed to delete");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Book> getBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
            try {
                Connection conn = dao.DatabaseConnection.connect();
                String query = "SELECT * FROM book";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet bookSet = ps.executeQuery();
                while(bookSet.next()){
                    Book book = new Book(); // empty object

                    book.setBookid(bookSet.getInt("bookid"));
                    book.setBookNumber(bookSet.getInt("booknumber"));
                    book.setBookName(bookSet.getString("bookname"));
                    book.setBookQuantity(bookSet.getInt("bookquantity"));
                    book.setBookAuthor(bookSet.getString("authorName"));

                    bookList.add(book);
                }
                return bookList;
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
}
