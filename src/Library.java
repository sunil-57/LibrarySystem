import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create some books and users
        Book book1 = new Book(12, "Atomic Habits",10, "James Clear");
        User user1 = new User("Sunil", "sunil-57", 5566);
        //show available options: available books, borrow book, return book, exit
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Show available books ");
        System.out.println("Enter 2: Borrow Book");
        System.out.println("Enter 3: Return Book");
        System.out.println("Enter 4: Exit");
        System.out.println("Choose an option: ");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("working on viewing available books");
        }else if(option == 2)
        {
            System.out.println("working on borrowing books");
            //TODO kun book borrow garne ho tyo chahi dinu parxha
            //TODO borrow garera sakesi message dekhauna parxa
            System.out.println("Before: "+ book1.getBookQuantity());
            user1.borrowBook(user1, book1);
            System.out.println("After: " + book1.getBookQuantity());
        }
        else if(option == 3)
        {
            System.out.println("working on returning books");
        }else if(option == 4)
        {
            System.out.println("working on exiting");
        }else
        {
            System.out.println("invalid option");
        }
        //TODO need to figure out where to keep the books and users?
    }
}
