package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(2015);
        car.setColor("Blue");
        car.setModel("Tesla");
        System.out.println(car.getAge() + "\n\n" + car.getColor() + "\n\n" + car.getModel());

    }
}
class Car {
    private int age;
    private String color;
    private String model;

    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
