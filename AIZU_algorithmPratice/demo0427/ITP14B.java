package demo0427;

import java.util.Scanner;


public class ITP14B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble(); //讀取圓的半徑
        System.out.printf("%.6f ", Math.PI * r * r); //計算圓的面積
        System.out.printf("%.6f", 2 * Math.PI * r); //計算圓的周長
    }
}
