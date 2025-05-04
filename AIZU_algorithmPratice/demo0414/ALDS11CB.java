package demo0414;
import java.util.*;

public class ALDS11CB {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(); //儲存數字的ArrayList
        @SuppressWarnings("resource") 
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { //當還有數字時
            int num = sc.nextInt(); //讀取數字
            list.add(num); //將數字加入ArrayList  
        }
        int count = 0;//計數器
        // 生成小質數列表（到 sqrt(10^8)）
        List<Integer> smallPrimes = generateSmallPrimes((int) Math.sqrt(1e8));

        // 判斷每個數字是否為質數
        for (int num : list) {
            if (isPrime(num, smallPrimes)) {
                count++;
            }
        }
        System.out.println(count); //輸出質數的數量
    }

    // 生成範圍內的所有小質數
    private static List<Integer> generateSmallPrimes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    // 用小質數列表判斷數字是否為質數
    private static boolean isPrime(int num, List<Integer> smallPrimes) {
        if (num < 2) return false;
        for (int prime : smallPrimes) {
            if (prime * prime > num) break; // 只需判斷到 sqrt(num)
            if (num % prime == 0) return false;
        }
        return true;
    }
}
