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

    public void updateBook(int bookid, int bookNumber) {
        bookdao.updateBookDetail(bookid, bookNumber);
    }

    public void deleteBook(int bookid) {
        bookdao.deleteBookDetail(bookid);
    }
}
