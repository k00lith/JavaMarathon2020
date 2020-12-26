package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("run");
        Scanner scan = new Scanner(System.in);
        int inInfo = scan.nextInt();
        if (inInfo <= 0) {
            System.out.println("Ошибка ввода");
        }
        if ((inInfo >= 1) && (inInfo <= 4)) {
            System.out.println("Малоэтажный дом");
        }
        if ((inInfo >= 5) && (inInfo <= 8)) {
            System.out.println("Среднеэтажный дом");
        }
        if (inInfo >= 9) {
            System.out.println("Многоэтажный дом");
        }

    }
}
