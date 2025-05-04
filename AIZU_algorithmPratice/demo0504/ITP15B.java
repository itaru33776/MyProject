package demo0504;

import java.util.Scanner;

public class ITP15B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }else {

                for (int i = 0; i < b; i++) System.out.print("#"); //第一排全印#
                System.out.println(); //換行

                //repeat()中填入的數字是要印的字元數量
                for (int i = 1; i < a-1; i++) { //第二排開始頭尾印#，中間印.
                    System.out.println("#" + ".".repeat(b-2) + "#"); //頭尾印#，中間印.
                }
                
                for (int i = 0; i < b; i++) System.out.print("#"); //最後一排全印#
                System.out.println("\n");
               
            }
        }
        scanner.close();
    }
}
