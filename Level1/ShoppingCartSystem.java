class Product{
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(String productName, double price, int quantity, int productID){
        this.productName = productName;
        this.price = price-(price*discount/100);
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayDetails(){
        System.out.println("\nName: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("ID: "+productID);
    }

    public static void main(String[] args) {
        System.out.println("Applicable discount to all products: "+discount+"%");
        Product p1 = new Product("Gel Pen", 10, 5, 982);
        Product p2 = new Product("Pencil", 3, 10, 6154);
        if (p1 instanceof Product) p1.displayDetails();
        if (p2 instanceof Product) p2.displayDetails();
    }
}