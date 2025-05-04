package demo0414;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

//此解法非最優解，過不了第四組測資
public class ALDS11CA {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(); //儲存數字的ArrayList
        
        while (sc.hasNextInt()) { //當還有數字時
            int num = sc.nextInt(); //讀取數字
            if (num % 2 == 0 || num!= 2) { 
                list.add(num); 
            } else if (num % 3 == 0 || num!=3) { 
                list.add(num); 
            } else if (num % 5 == 0 || num!= 5) { 
                list.add(num); 
            }else if (num % 7 == 0 || num!= 7){
                list.add(num); 
            }
        }


        int count = 0; //計數器，儲存質數的個數
        Integer x = Collections.max(list); //找出ArrayList中的最大值

        HashSet <Integer> set = new HashSet<>(); //儲存質數的HashSet
        set.add(2); //2是第一個質數
        for (int i = 3; i <= x; i += 2) { //從3開始，步進2，因為偶數不可能是質數
            boolean isPrime = true; //假設i是質數
            for (int j = 3; j * j <= i; j += 2) { //從3開始，步進2，因為偶數不可能是質數
                if (i % j == 0) { //如果i能被j整除，則i不是質數
                    isPrime = false; //設置isPrime為false
                    break; //跳出內層迴圈
                }
            }
            if (isPrime) { //如果isPrime仍然為true，則i是質數
                set.add(i); //將i加入HashSet
            }
        }

        for (int i = 0; i < list.size(); i++) { //遍歷ArrayList中的每個數字
            if (set.contains(list.get(i))) { //如果HashSet中包含該數字
                count++; //計數器加1
            }
        }

        System.out.println(count); //輸出質數的個數
    }
}
