package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            int count = 0;
            int rsl = b - a;
            while (count < rsl) {
                count++;
                if (((count + a) % 5 == 0) && ((count + a) % 10 != 0)) {
                    System.out.print((count + a) + " ");
                }
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
