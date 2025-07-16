import view.MenuView;

public class Library {
    public static void main(String[] args) {
        MenuView.showMenuView();

//        if(option == 1){
//            System.out.println("Available books");
//            try {
//                Connection conn = dao.DatabaseConnection.connect();
//                ArrayList<Book> bookList = new ArrayList<>();
//                String query = "SELECT booknumber,bookName, bookquantity,authorName FROM book";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ResultSet bookSet = ps.executeQuery();
//                while(bookSet.next()){
////                    int bookNumber = bookSet.getInt("booknumber");
////                    String bookName = bookSet.getString("bookname");
////                    int bookQuantity = bookSet.getInt("bookquantity");
////                    String authorName = bookSet.getString("authorName");
//                    Book book = new Book(
//                                    bookSet.getInt("booknumber"),
//                                    bookSet.getString("bookname"),
//                                    bookSet.getInt("bookquantity"),
//                                    bookSet.getString("authorName"));
//                    bookList.add(book);
//                }
//                for(Book book: bookList){
//                    System.out.println("models.Book Number: "+book.getBookNumber());
//                }
//            } catch (SQLException | ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }else if(option == 2)
//        {
//            System.out.println("working on borrowing books");
//            //TODO kun book borrow garne ho tyo chahi dinu parxha
//            //TODO borrow garera sakesi message dekhauna parxa
//            System.out.println("Before: "+ book1.getBookQuantity());
//            user1.borrowBook(user1, book1);
//            System.out.println("After: " + book1.getBookQuantity());
//        }
//        else if(option == 3)
//        {
//            System.out.println("working on returning books");
//        }
//        else if(option == 4)
//        {
//            System.out.println("Enter book id: ");
//            int bookid = input.nextInt();
//            System.out.println("Enter book Number: ");
//            int bookNumber = input.nextInt();
//            try {
//                Connection conn = dao.DatabaseConnection.connect();
//                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ps.setInt(1,bookNumber);
//                ps.setInt(2, bookid);
//                if(ps.executeUpdate() > 0){
//                    System.out.println("book updated");
//                }else{
//                    System.out.println("Failed to update");
//                }
//            } catch (SQLException | ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        else if(option == 5){
//            System.out.println("Enter the book id to delete: ");
//            int bookid = input.nextInt();
//            try {
//                Connection conn = dao.DatabaseConnection.connect();
//                String query = "DELETE FROM book WHERE bookid = ?";
//                PreparedStatement ps = conn.prepareStatement(query);
//                ps.setInt(1,bookid);
//                if(ps.executeUpdate() > 0){
//                    System.out.println("book deleted");
//                }else{
//                    System.out.println("Failed to delete");
//                }
//            } catch (SQLException | ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        else
//        {
//            System.out.println("invalid option");
//        }
        //TODO need to figure out where to keep the books and users?
    }
}
