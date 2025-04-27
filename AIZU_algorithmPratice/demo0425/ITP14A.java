package demo0425;

import java.util.Scanner;

public class ITP14A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 讀取第一行的數字 a
        int b = sc.nextInt(); // 讀取第二行的數字 b
        double c = (double)a/b;
        System.out.print((a/b)+" "+(a%b)+" "); // 輸出結果
        System.out.printf("%.5f\n", c); // 輸出結果，保留5位小數
    }
}
