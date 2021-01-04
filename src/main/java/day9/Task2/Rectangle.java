package day9.Task2;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }
    public double area() {      // S = a * b
        return height * width;
    }
    public double perimeter() { // P = 2 * (a + b)
        return 2 * (height + width);
    }
}
