import java.util.Scanner;

class Circle{
    double radius;

    Circle(){
        try(Scanner sc = new Scanner(System.in);){
            double radius = sc.nextDouble();
            this.radius = radius;
        }
    }
    
    Circle(double radius){
        this.radius = radius;
    }

    void display(){
        System.out.println("Radius: "+radius);
    }

    public static void main(String[] args){
        Circle circle1 = new Circle();
        circle1.display();

        Circle circle2 = new Circle(5.0);
        circle2.display();
    }
}
