class LibraryBook{
    String title;
    String author;
    double price;
    static boolean availability = true;

    LibraryBook(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void BorrowBook(){
        if(availability){
            availability = false;
            System.out.println("You have borrowed the book titled "+title+" by "+author+" priced at "+price);
        }
        else{
            System.out.println("This book is currently unavailable. [Status : Borrowed]");
        }
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Ink Heart", "Forgot",24.99);
        b1.BorrowBook();
        LibraryBook b2 = new LibraryBook("Ink Heart", "Forgot",24.99);
        b2.BorrowBook();
    }
}