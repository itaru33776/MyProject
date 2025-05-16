package demo0515;

import java.util.Scanner;

public class ITP6D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] martixA = new int[n][m];
        int[] vectorB = new int[m];
        int[] vectorC = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                martixA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            vectorB[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            vectorC[i] = 0;
            for (int j = 0; j < m; j++) {
                vectorC[i] += martixA[i][j] * vectorB[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vectorC[i]);
        }
    }

}
