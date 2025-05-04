package demo0429;

import java.util.Scanner;

public class ITP14C {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            ans(a,op,b);
        }
        sc.close();
    }

    public static void ans(int a, String op, int b){
        switch (op) {
            case "+" -> System.out.println(a+b);
            case "-" -> System.out.println(a-b);
            case "*" -> System.out.println(a*b);
            case "/" -> {
                if (b!= 0) {
                    System.out.println(a/b);
                }
            }
            case "?" -> {
            }
            default -> throw new AssertionError();
        }
    }
}
