package day9.Task2;

public class Circle extends Figure {
    final double PI = 3.14;
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double area() {         // S = π * r2 (в квадрате)
        return PI * (Math.pow(radius, 2));
    }
    public double perimeter() {   // P = 2 * π * r
        return 2 * PI * radius ;
    }
}
