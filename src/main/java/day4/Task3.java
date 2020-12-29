package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8]; // matrix.length = 12 (строки); matrix[0].length = 8 (столбцы)
        Random random = new Random();
        int sum = 0;
        int sumBest = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
        for (int i = 0; i < matrix.length; i++) {
            if (sumBest < sum) {
                sumBest = sum;
                index = i - 1;
            }
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Сумма строки: " + i + " равна = " + sum);
        }
        System.out.println("Максимальная сумма значений по строкам: " + sumBest);
        System.out.println("Ее индекс: " + index);
    }
}
