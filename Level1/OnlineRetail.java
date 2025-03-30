import java.time.*;

class Order{
    int orderId;
    LocalDate orderDate;

    Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order{
    int trackingNumber;

    ShippedOrder(int orderId, LocalDate orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Shipped";
    }
}

class DeliveredOrder extends ShippedOrder{
    LocalDate deliveryDate;

    DeliveredOrder(int orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Delivered";
    }
}

class Main{
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, LocalDate.now().minusDays(5), 123456, LocalDate.now());
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Status: " + order.getOrderStatus());
    }
}