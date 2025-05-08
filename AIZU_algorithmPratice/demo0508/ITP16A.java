package demo0508;

import java.util.Scanner;

class ITP16A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int [] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i]+" ");
            }else {
                System.out.println(a[i]);
            }
        }
    }
}