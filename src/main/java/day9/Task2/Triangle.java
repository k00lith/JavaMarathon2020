package day9.Task2;

public class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {      // p = (a + b + c) / 2 ; S = sqr | p*(p-a)*(p-b)*(p-c)
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double perimeter() { // P = a + b + c
        return a + b + c;
    }
}
