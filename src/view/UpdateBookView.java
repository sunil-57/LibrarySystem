package view;

import controller.BookController;

import java.util.Scanner;

public class UpdateBookView {
    public static void showUpdateBookView() {
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book id: ");
        System.out.println("Enter 0 to cancle: ");
        int bookid = input.nextInt();
        if(bookid == 0){
            System.out.println("Returning to main menu...");
        }else{
            System.out.println("Enter book Number: ");
            int bookNumber = input.nextInt();
            if (bookController.updateBook(bookid, bookNumber) > 0) {
                System.out.println("book updated");
            } else {
                System.out.println("Failed to update");
            }
        }
    }
}
