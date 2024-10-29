package Abstraction;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.area();

        System.out.println("Diện tích hình tròn: " + circle.calculateArea());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.calculateArea());
    }
}
