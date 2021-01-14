package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        recursionSum(numbers, 0);
    }

    public static int recursionSum(int[] n, int i) {
        if (i == n.length) {
            return 0;
        }
        return n[i] + recursionSum(n, i + 1);
    }
}
