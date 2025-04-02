
abstract class FoodItem{
    private String itemName;
    private int quantity;
    private double price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}

interface Discountable{
    void applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable{
    private double discount=0;
    @Override
    public double calculateTotalPrice(){
        return getQuantity() * getPrice();
    }

    @Override
    public void applyDiscount(){
        discount = 0.1 * calculateTotalPrice();
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Discount Applied: "+discount);
        System.out.println("Price after discount: "+(calculateTotalPrice() - discount));
    }
}

class NonVegItem extends FoodItem implements Discountable{
    private double discount=0;
    @Override
    public double calculateTotalPrice(){
        double extraCharge = 1.5;
        return getQuantity() * getPrice() * extraCharge;
    }

    @Override
    public void applyDiscount(){
        discount = 0.05 * calculateTotalPrice();
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Discount Applied: "+discount);
        System.out.println("Price after discount: "+(calculateTotalPrice() - discount));
    }
}

class Main{
    public static void main(String[] args) {
        FoodItem[] item = new FoodItem[2];
        
        VegItem i1 = new VegItem();
        i1.setItemName("Mushroom");
        i1.setPrice(10);
        i1.setQuantity(13);

        NonVegItem i2 = new NonVegItem();
        i2.setItemName("Shrimp");
        i2.setPrice(65);
        i2.setQuantity(10);

        item[0] = i1;
        item[1] = i2;

        for(FoodItem i : item){
            i.getItemDetails();
            System.out.println("Total Price: "+i.calculateTotalPrice());
            Discountable d = (Discountable) i;
            d.applyDiscount();
            d.getDiscountDetails();
        }
    }
}