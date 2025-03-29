class Customer {
    private String name;
    private Order[] orders;
    private int orderCount;

    public Customer(String name, int maxOrders) {
        this.name = name;
        this.orders = new Order[maxOrders];
        this.orderCount = 0;
    }

    public void placeOrder(Order order) {
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
            System.out.println(name + " placed an order with ID: " + order.getOrderId());
        } else {
            System.out.println(name + " cannot place more orders.");
        }
    }

    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (int i = 0; i < orderCount; i++) {
            orders[i].displayOrderDetails();
        }
    }

    public String getName() {
        return name;
    }
}

class Order {
    private static int idCounter = 1;
    private int orderId;
    private Product[] products;
    private int productCount;

    public Order(int maxProducts) {
        this.orderId = idCounter++;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products to order " + orderId);
        }
    }

    public void displayOrderDetails() {
        System.out.println("  Order ID: " + orderId);
        for (int i = 0; i < productCount; i++) {
            System.out.println("    Product: " + products[i].getName());
        }
    }

    public int getOrderId() {
        return orderId;
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", 2);

        Order order1 = new Order(3);
        Order order2 = new Order(2);

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");
        Product p3 = new Product("Headphones");

        order1.addProduct(p1);
        order1.addProduct(p2);
        order2.addProduct(p3);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer1.displayOrders();
    }
}