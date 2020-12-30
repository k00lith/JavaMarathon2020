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
