package demo0421;
import java.util.*;

public class ALDS11D {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(); //儲存數字的ArrayList
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀取第一行的數字 n
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (list.size() < 2) {
            System.out.println("需要至少兩個輸入數字");
            return;
        }
        
        int maxv = Integer.MIN_VALUE;
        int minv = list.get(0); //預設最小值為第一個數字

        for (int j = 1; j < list.size(); j++) { //從0開始到list的大小
            maxv = Math.max(maxv, list.get(j) - minv); //計算最大利益
            minv = Math.min(minv, list.get(j)); //計算最小值
        }
        System.out.println(maxv); //輸出最大利益
    }
}