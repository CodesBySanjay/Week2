import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}

class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.updateQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(itemName, price, quantity));
    }

    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            item.displayItem();
        }
        displayTotalCost();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 1500, 2);
        cart.displayCart();

        cart.addItem("Mouse", 1500, 1);
        cart.displayCart();

        cart.removeItem("Mouse");
        cart.displayCart();
    }
}