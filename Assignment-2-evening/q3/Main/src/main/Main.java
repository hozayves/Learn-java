
package main;

import java.util.Scanner;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Triangle;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);

        // Rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = input.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        // Triangle
        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = input.nextDouble();
        Triangle triangle = new Triangle(base, height);

        // Display areas
        System.out.println("\n=== Area Results ===");
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());

        input.close();
    }
}
