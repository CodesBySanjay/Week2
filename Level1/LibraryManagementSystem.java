abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(String name);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    public int getLoanDuration() {
        return 14;
    }

    public boolean reserveItem(String name) {
        if (!reserved) {
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    public int getLoanDuration() {
        return 3;
    }

    public boolean reserveItem(String name) {
        if (!reserved) {
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Magazine(2, "National Geographic", "Various"),
            new DVD(3, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                System.out.println("Reserved: " + r.reserveItem("User"));
                System.out.println("Available After Reserve: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}