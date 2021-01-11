package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Mercedes"));
        System.out.println(list);
        list.add(3, "VW");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
