public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void calc(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle: " + circumference);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.calc(3);
    }
}