package view;

import controller.ViewController;

import java.util.Scanner;

public class MenuView {
    public static void showMenuView() {
        Scanner input = new Scanner(System.in);
        //show available options: available books, borrow book, return book, exit
        while (true) {
            System.out.println("Welcome to the Library");
            System.out.println("Enter 1: Add a new Book ");
            System.out.println("Enter 2: View Available Book");
            System.out.println("Enter 3: Borrow Book");
            System.out.println("Enter 4: Return Book");
            System.out.println("Enter 5: Update Book");
            System.out.println("Enter 6: Delete Book");
            System.out.println("Enter 7: Exit");
            System.out.println("Choose an option: ");
            int option = input.nextInt();
            if (option < 0) {
                System.out.println("Enter a positive value, use the given options...");
            } else {
                switch (option) {
                    case 1:
                        ViewController.getAddBookView();
                        break;
                    case 2:
                        ViewController.getAvailableBooks();
                        break;
                    case 3:
                        ViewController.getBorrowBookView();
                        break;
                    case 4:
                        ViewController.getReturnBookView();
                        break;
                    case 5:
                        ViewController.getUpdateBookView();
                        break;
                    case 6:
                        ViewController.getDeleteBookView();
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Choose a valid Option, Please Enter 1 to 7... Thank you.");
                }
            }

        }
    }
}
