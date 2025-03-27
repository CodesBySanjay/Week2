class Book{
    String title; //Attributes
    String author;
    double price;

    Book(){ //Default constructor
        this.title = "Random Title";
        this.author = "Random Author";
        this.price = 0.0;
    }

    Book(String title, String author, double price){ //Parametrized constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void bookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: $"+price);
    }

    public static void main(String[] args){
        Book book1 = new Book();
        System.out.println("Book 1 details: ");
        book1.bookDetails();

        Book book2 = new Book("The Jungle Book", "J.K.Rowling",19.39);
        System.out.println("\nBook 2 details: ");
        book2.bookDetails();
    }
}