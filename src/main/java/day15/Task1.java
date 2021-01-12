package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File source = new File("src/main/resources/shoes.csv");
        PrintWriter dest = new PrintWriter("src/main/resources/missing_shoes.txt");
        Scanner scanner1 = new Scanner(source);
        while(scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            char zero = '0';
            char point = ';';
            if (line.charAt(line.length() - 1) == zero && line.charAt(line.length() - 2) == point) {
                dest.println(line);
            }
        }
        dest.close();
    }
}
