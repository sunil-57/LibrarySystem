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
        System.out.println("Choose an option: ");
        int option = input.nextInt();
        while(true){
            if(option > 0){
                if(option == 1){
                    ViewController.getAddBookView();
                }
                else if(option == 2){
                    ViewController.getAvailableBooks();
                }
                else if(option == 3){
                    ViewController.getBorrowBookView();
                }
                else if(option == 4){
                    ViewController.getUpdateBookView();
                }
                else if(option == 5){
                    ViewController.getDeleteBookView();
                }
                else {
                    break;
                }
            }else {
                System.out.println("Invalid Option, Please Enter 1 to 6... Thank you.");
            }
        }
    }
}
