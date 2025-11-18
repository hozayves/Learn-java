package assignment1;


abstract class Shape {
  abstract double Area();
}
class Rectangle extends Shape {
  private final double length;
  private final double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  @Override
  public double Area() {
    return length * width;
  }
  // Overloading example
  public double Area(double newLength, double newWidth) {
    return newLength * newWidth;
  }
}
class Square extends Shape {
  private final double sides;

  Square(double sides) {
    this.sides = sides;
  }
  @Override
  public double Area() {
    return Math.pow(sides, 2);
  }
  // Overloading example
  public double Area(double newSides) {
    return Math.pow(newSides, 2);
  }
}
public class Question2 {
      public static void main(String[] args) {
        Rectangle newRect = new Rectangle(5, 7);
        Square newSquare = new Square(8);

        System.out.println("Rectangle Area; "+ newRect.Area());
        System.out.println("Rectangle Area (9x9): "+ newRect.Area(9, 9));

        System.out.println("\nSquare Area: "+ newSquare.Area());
        System.out.println("Square Area (7): "+ newSquare.Area(7));
      }
}
