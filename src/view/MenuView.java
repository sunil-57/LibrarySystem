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
        if(option == 1){
            ViewController.getAddBookView();
        }
        else if(option == 2){
            ViewController.getAvailableBooks();
        }
    }
}
