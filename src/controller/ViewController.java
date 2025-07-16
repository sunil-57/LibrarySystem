package controller;

import view.AddBookView;
import view.AvailableBooksView;
import view.DeleteBookView;
import view.UpdateBookView;

public class ViewController {
    public static void getAddBookView(){
        AddBookView.showAddBookView();
    }
    public static void getAvailableBooks() {
        AvailableBooksView.showAvailableBooksView();
    }

    public static void getBorrowBookView() {
        //TODO views related to borrow a book
    }

    public static void getUpdateBookView() {
        UpdateBookView.showUpdateBookView();
    }

    public static void getDeleteBookView() {
        //TODO views while deleting a book
        DeleteBookView.showDeleteBookView();
    }
}
