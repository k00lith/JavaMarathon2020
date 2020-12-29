package day4;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        int big8 = 0;
        int equ1 = 0;
        int even = 0;
        int neve = 0;
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            if (array[i] > 8) {
                big8++;
            }
            if (array[i] == 1) {
                equ1++;
            }
            if (array[i]%2 == 0) {
                even++;
            }
            if (array[i]%2 != 0) {
                neve++;
            }
            summ = summ + array[i];
        }
        System.out.println("Введено число" + size + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве: ");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + big8);
        System.out.println("Количество чисел равных 1: " + equ1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + neve);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}
