package controller;

import dao.BookDAO;
import models.Book;

public class BookController {

    public void storeBook(Book book){
        BookDAO bookdao = new BookDAO();
        bookdao.insertBook(book);
    }

    public void getBooks() {
        BookDAO bookdao = new BookDAO();
        bookdao.getBooks();
    }

    public void updateBook(int bookid, int bookNumber) {
        BookDAO bookdao = new BookDAO();
        bookdao.updateBookDetail(bookid, bookNumber);
    }

    public void deleteBook(int bookid) {
        BookDAO bookdao = new BookDAO();
        bookdao.deleteBookDetail(bookid);
    }
}
