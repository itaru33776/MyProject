package demo0513;

import java.util.Scanner;

public class ITP16C {
    public static void main(String[] args) {
        int[][] A = new int[12][10];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 入力の行数
        // 入力
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            if (v >= -9 && v <= 9) {
                int [] a = converter(b,f,r);
                if (A[a[0]][a[1]]+v > 9 || A[a[0]][a[1]]+v < 0) {
                    continue;
                }
                A[a[0]][a[1]]+=v;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                sb.append(" ").append(A[i][j]);
            }
            sb.append("\n");
            if (i == 2 || i == 5 || i == 8) {
                sb.append("####################\n");
            }
        }
        System.out.print(sb.toString());
    }

    //轉換樓層與陣列index的對應
    public static int[] converter(int b, int f, int r) {
        return new int[]{(b - 1) * 3 + (f - 1), r - 1};
    }
}