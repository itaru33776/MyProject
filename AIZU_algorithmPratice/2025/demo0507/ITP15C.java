package demo0507;

import java.util.Scanner;

public class ITP15C {
    //以下為我自己的解法，非參考解法
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            boolean flag = true; //用來判斷印什麼花色
            if (a == 0 && b == 0) {
                break;
            }else {
                if (b % 2 == 1) { 
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++){
                            if (flag) {
                                System.out.print("#");
                                flag = false;
                            }else {
                                System.out.print(".");
                                flag = true;
                            }
                        }
                        System.out.println();
                    }
                }else {
                    for (int i = 0; i < a; i++) {

                        for (int j = 0; j < b; j++){
                            if (flag) {
                                System.out.print("#");
                                flag = false;
                            }else {
                                System.out.print(".");
                                flag = true;
                            }
                        }
                        flag = !flag; //每一行的第一個顏色要跟上一行的最後一個顏色相同
                        System.out.println();
                    }
                }
            }
        }
        scanner.close();
    }

    public void answer() {
        //以下為參考解法，用棋盤座標位置來判斷該印什麼花色，
        //比用flag來判斷要印什麼花色的方式還要簡單
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println(); // 確保每個棋盤輸出後有空行
        }
        scanner.close();
    }
}
