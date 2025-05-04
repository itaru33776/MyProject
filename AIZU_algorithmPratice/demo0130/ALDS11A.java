package demo0130;

import java.util.Scanner;

class ALDS11A { 
    //插入sort的排序方法
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int v = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;

            // 確保輸出格式正確
            System.out.print(a[0]);
            for (int r = 1; r < n; r++) {
                System.out.print(" " + a[r]);
            }
            System.out.println();
        }
        sc.close();
    }
}
