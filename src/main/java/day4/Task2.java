package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int count0 = 0;
        int countN0 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        for (int value : array) {
            if (value > max ) {
                max = value;
            }
            if (value < min ) {
                min = value;
            }
        }
        for (int value : array) {
            if (value%10 == 0 ) {
                count0++;
            }
            if (value%10 != 0 ) {
                countN0++;
            }

        }
        System.out.println("наибольший элемент массива- " + max);
        System.out.println("наименьший элемент массива- " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0- " + count0);
        System.out.println("сумму элементов массива, оканчивающихся на 0- " + countN0);
    }
}
