class Product{
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: $"+price);
    }

    static void displayTotalProducts(){
        System.out.println("Total products: "+totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("NoteBook", 0.7);
        p1.displayProductDetails();
        Product.displayTotalProducts();
    }
}