class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
                                                                                                                                                                                                                   
class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
}

class Main{
    public static void main(String[] args) {
        Author a = new Author("Sample", 2025, "Person1", "I wrote a book");
        a.displayInfo();
    }
}