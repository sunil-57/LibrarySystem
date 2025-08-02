package view;

import controller.ViewController;

import java.util.Scanner;

public class MenuView {
    public static void showMenuView(){
        Scanner input = new Scanner(System.in);
        //show available options: available books, borrow book, return book, exit
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Add a new Book ");
        System.out.println("Enter 2: View Available Book");
        System.out.println("Enter 3: Borrow Book");
        System.out.println("Enter 4: Update Book");
        System.out.println("Enter 5: Delete Book");
        System.out.println("Enter 6: Exit");
        while(true){
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
                        ViewController.getUpdateBookView();
                        break;
                    case 5:
                        ViewController.getDeleteBookView();
                        break;
                    case 6:
                        break; // Exit
                    default:
                        System.out.println("Choose a valid Option, Please Enter 1 to 6... Thank you.");
                }
            }

        }
    }
}
