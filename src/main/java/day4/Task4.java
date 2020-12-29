package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int sumRsl = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        for (int i = 0; i < (array.length - 2); i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sumRsl < sum) {
                sumRsl = sum;
                index = i;
            }
        }
        System.out.println("значение суммы: " + sumRsl);
        System.out.println("индекс первого элемента тройки: " + index);

    }
}
