package demo0422;

import java.util.Scanner;

class ALDS11A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取第一行的數字 n
        int[] A = new int[n]; // 創建一個大小為 n 的整數數組 A
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt(); // 讀取接下來的 n 個整數並存入數組 A 中
        }
        new ALDS11A().bubbleSort(A, n); // 調用冒泡排序方法對數組 A 進行排序
    }

    public void bubbleSort(int[] A , int N){
        boolean flag = true;
        int count = 0; // 計數器，用於計算交換次數
        while (flag) {
            flag = false;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    count++; // 每次交換時增加計數器
                    flag = true;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i]); // 輸出排序後的數組 A
            if (i < N - 1) {
                System.out.print(" "); // 在數字之間添加空格
            }
        }
        System.out.println(); // 換行
        System.out.println(count); // 輸出交換次數
    }
}