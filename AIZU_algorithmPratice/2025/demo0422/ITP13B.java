package demo0422;

import java.util.ArrayList;
import java.util.Scanner;

public class ITP13B {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(); //儲存數字的ArrayList
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { //當還有數字時
            int num = sc.nextInt(); //讀取數字
            list.add(num); //將數字加入ArrayList  
        }
        for (int i = 0; i < list.size(); i++) { //從0開始到list的大小
            if (list.get(i) != 0) { //如果是最後一個數字
                System.out.println("Case "+(i+1)+": "+list.get(i));
            } else {
                break;
            }
        }
    }
}
