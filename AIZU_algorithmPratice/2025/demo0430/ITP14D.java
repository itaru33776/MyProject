package demo0430;

import java.util.Scanner;



public class ITP14D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取數字的個數
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println(min + " " + max + " " + sum);
        sc.close();
    }
}
