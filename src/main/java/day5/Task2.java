package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2015, "blue", "suzuki");
        System.out.println(moto.getAge() + "\n\n" + moto.getColor() + "\n\n" + moto.getModel());

    }
}
class Motorbike {
    private int age;
    private String color;
    private String model;

    public Motorbike(int age, String color, String model) {
        this.age = age;
        this.color = color;
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
