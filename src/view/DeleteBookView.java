package view;

import controller.BookController;
import models.Book;

import java.util.Scanner;

public class DeleteBookView {
    public static void showDeleteBookView() {
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
        for(Book book: bookController.getBooks()){
            System.out.println("Book ID: " + book.getBookId() + " | Book Name: " + book.getBookName());
        }
        System.out.println("Enter the book id to delete: ");
        System.out.println("Enter 0 to cancle: ");
        int bookId = input.nextInt();
        if(bookId == 0){
            System.out.println("Returning to main menu");
        }else{
            if (bookController.deleteBook(bookId) > 0) {
                System.out.println("book deleted");
            } else {
                System.out.println("Failed to delete");
            }
        }
    }
}
