package demo_0130;


import java.util.Scanner;

class Demo04 {
    //輾轉相除法取兩數的最大公約數
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else {
            return gcd(b, a % b );
        }
    }

}