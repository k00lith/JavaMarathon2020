package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Person> list = new ArrayList<>();
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] man = line.split(" ");
                if (Integer.parseInt(man[1]) < 0) {
                    throw new IOException();
                }
                list.add(new Person(man[0], Integer.parseInt(man[1])));
            }
            scanner.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
