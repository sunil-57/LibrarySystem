package view;

import controller.BookController;

import java.util.Scanner;

public class DeleteBookView {
    public static void showDeleteBookView() {
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter the book id to delete: ");
        int bookid = input.nextInt();
        if (bookController.deleteBook(bookid) > 0) {
            System.out.println("book deleted");
        } else {
            System.out.println("Failed to delete");
        }
    }
}
