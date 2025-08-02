package controller;

import dao.BookDAO;
import models.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController{
    private BookDAO bookdao;
    public BookController(){
        try {
            bookdao = new BookDAO();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public int storeBook(Book book){
        return bookdao.insertBook(book);
    }

    public ArrayList<Book> getBooks() {
        return bookdao.getBooks();
    }

    public int updateBook(int bookid, int bookNumber) {
        return bookdao.updateBookDetail(bookid, bookNumber);
    }

    public int deleteBook(int bookid) {
       return bookdao.deleteBookDetail(bookid);
    }
}
