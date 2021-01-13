package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file16.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] nums = line.split(" ");
        double rsl = 0;
        for (String number : nums) {
            rsl += Integer.parseInt(number);
        }
        rsl = (rsl / nums.length);

        scanner.close();
        System.out.printf(rsl + " --> %.3f", rsl);
    }
}

