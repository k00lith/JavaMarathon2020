package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rsl = true;
        while (rsl) {
            double a = scanner.nextDouble(); // делимое
            double b = scanner.nextDouble(); // делитель
            if (b != 0) {
                System.out.println(a / b);
            } else {
                rsl = false;
                break;
            }
        }
    }
}
