package controller;

import dao.BookDAO;
import models.Book;

public class BookController {
    public void storeBook(Book book){
        BookDAO bookdao = new BookDAO();
        bookdao.insertBook(book);
    }
}
