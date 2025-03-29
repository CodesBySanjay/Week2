
import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void displayBookDetails(){
        System.out.println("Title: "+title+", Author: "+author);
    }
}
class Library{
    private ArrayList<Book> books;
    
    Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books available are: ");
        for(Book book : books){
            book.displayBookDetails();
        }
    }
}
class Main{
    public static void main(String[] args) {
        Book b1 = new Book("Book 1", "First");
        Book b2 = new Book("Book 2", "Second");
        Book b3 = new Book("Book 3", "Third");

        Library l1 = new Library();
        Library l2 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b3);

        l1.displayLibraryBooks();
        l2.displayLibraryBooks();
    }
}