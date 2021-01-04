package day8;

public class Task1 {
    public static void main(String[] args) {
        long time = System.nanoTime();
        StringBuilder str1 = new StringBuilder("0");
        for (int i = 1; i <= 20000 ; i++) {  // Elapsed    50,295 ms
            str1.append(" " + i);
        }
//        String str2 = "0";
//        for (int i = 1; i <= 20000 ; i++) { // Elapsed   394,522 ms
//            str2 = str2 + " " + i;
//        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
        System.out.println(str1.toString());
        //System.out.println(str2);
    }
}
