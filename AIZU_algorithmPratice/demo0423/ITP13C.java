package demo0423;
import java.util.ArrayList;
import java.util.Scanner;

public class ITP13C {
    public static void main(String[] args) {
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>(); //儲存數字的ArrayList
        while (sc.hasNextInt()) { //當還有數字時
            int num = sc.nextInt(); //讀取數字
            list.add(num); //將數字加入ArrayList  
        }
        
        for (int i = 0; i < list.size(); i+=2) { //遍歷ArrayList
            if (list.get(i)>list.get(i+1)) { //如果前一個數字小於後一個數字
                int n = list.get(i); //將前一個數字存入n
                list.set(i, list.get(i+1)); //將前一個數字設為後一個數字
                list.set(i+1, n); //將後一個數字設為n
            }
            if (list.get(i)!=0 || list.get(i+1)!=0) { //如果兩個數字都是0
                System.out.println(""+list.get(i)+" "+list.get(i+1)); //輸出結果
            }
        }
    }
}