package view;

import controller.BookController;

public class AvailableBooksView {
    public static void showAvailableBooksView(){
        BookController bookController = new BookController();
        bookController.getBooks();
    }
}
