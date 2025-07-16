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
//        }
//        else if(option == 2)
//        {
//            System.out.println("working on borrowing books");
//            //TODO kun book borrow garne ho tyo chahi dinu parxha
//            //TODO borrow garera sakesi message dekhauna parxa
//            System.out.println("Before: "+ book1.getBookQuantity());
//            user1.borrowBook(user1, book1);
//            System.out.println("After: " + book1.getBookQuantity());
//        }

        //TODO need to figure out where to keep the books and users?
    }
}
