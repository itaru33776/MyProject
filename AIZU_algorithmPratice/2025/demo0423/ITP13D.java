package demo0423;

import java.util.Scanner;

public class ITP13D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int [] n = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int count = 0;//計數器
        
        for (int i = n[0]; i <= n[1]; i++) {
            if (n[2]%i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
