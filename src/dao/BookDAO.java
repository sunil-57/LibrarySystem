package dao;

import models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
    public void insertBook(Book book){
        try {
            Connection conn = dao.DatabaseConnection.connect();
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
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void updateBookDetail(int bookid, int bookNumber) {
        try {
                Connection conn = dao.DatabaseConnection.connect();
                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,bookNumber);
                ps.setInt(2, bookid);
                if(ps.executeUpdate() > 0){
                    System.out.println("book updated");
                }else{
                    System.out.println("Failed to update");
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    public void deleteBookDetail(int bookid) {
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookid);
            if (ps.executeUpdate() > 0) {
                System.out.println("book deleted");
            } else {
                System.out.println("Failed to delete");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
