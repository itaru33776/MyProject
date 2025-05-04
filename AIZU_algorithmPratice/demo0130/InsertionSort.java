package demo0130;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner sc = new Scanner(System.in);
        int [] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        sc.close();
    }

    
}
