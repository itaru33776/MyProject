package demo0425;

import java.util.Scanner;

public class ALDS12B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取第一行的數字 n
        int[] A = new int[n]; // 創建一個大小為 n 的整數數組 A
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt(); // 讀取接下來的 n 個整數並存入數組 A 中
        }
        new ALDS12B().selectionSort(A, n);
    }

    public void selectionSort(int [] A, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minj]) {
                    minj = j;
                }
            }
            count+=swap(A, i, minj);
            System.out.print(A[i]+" "); // 輸出排序後的數組 A
        }
        System.out.print(A[n-1]+"\n"); // 輸出最後一個元素
        System.out.println(count); // 輸出最後一個元素
    }

    public int swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        if (i != j) {
            return 1; // swap occurred
        } else {
            return 0; // no swap occurred
        }
    }
}