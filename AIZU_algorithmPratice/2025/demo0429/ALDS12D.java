package demo0429;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ALDS12D {
    int cnt = 0;

    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        
        ALDS12D shell = new ALDS12D();
        shell.shellSort(A, n);
    }

    public void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {  // i の範囲修正 (正しくソートされるように)
            int v = A[i];
            int j = i - g;
            while (j >= 0 && A[j] > v) {
                A[j + g] = A[j];
                j -= g;
                cnt++;  // 移動回数をカウント
            }
            A[j + g] = v;
        }
    }

    public void shellSort(int[] A, int n) {
        cnt = 0;

        // 間隔 G を生成（Knuth の間隔を使用）
        ArrayList<Integer> G = new ArrayList<>();
        int gap = 1;
        while (gap < n) {
            G.add(gap);
            gap = 3 * gap + 1;
        }
        Collections.reverse(G); // 大きい順に並べる
        
        // G のサイズ m を決定
        int m = G.size();
        if (m == 0) {
            m++;
        }
        System.out.println(m);

        if (G.isEmpty()) {
            System.out.print(1);
        } else {
            // G の出力（降順）
            for (int g : G) {
                System.out.print(g + " ");
            }
        } 
        System.out.println();

        // シェルソートの処理
        for (int g : G) {
            insertionSort(A, n, g);
        }
        
        // cnt（ソート回数）の出力
        System.out.println(cnt);

        // 昇順にソートされた A の出力
        for (int num : A) {
            System.out.println(num);
        }
    }
}
