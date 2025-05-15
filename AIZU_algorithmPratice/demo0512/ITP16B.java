package demo0512;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ITP16B {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        //4個花色各13張牌
        TreeSet<Integer> S = new TreeSet<>();
        TreeSet<Integer> H = new TreeSet<>();
        TreeSet<Integer> C = new TreeSet<>();
        TreeSet<Integer> D = new TreeSet<>();
        
        //4個花色各13張牌
        for (int i = 1; i <= 13; i++) {
            S.add(i);
            H.add(i);
            C.add(i);
            D.add(i);
        }
        //有幾張牌
        int hasCard = sc.nextInt();
        for (int i = 0; i < hasCard; i++) {
            String card = sc.next();
            int removeCard = sc.nextInt();
            switch (card) {
                case "S" -> S.remove(removeCard);
                case "H" -> H.remove(removeCard);
                case "C" -> C.remove(removeCard);
                case "D" -> D.remove(removeCard);
                default -> {
                }
            }
        }

        Iterator<Integer> itS = S.iterator();
        while (itS.hasNext()) {
            System.out.println("S " + itS.next());
        }
        Iterator<Integer> itH = H.iterator();
        while (itH.hasNext()) {
            System.out.println("H " + itH.next());
        }
        Iterator<Integer> itC = C.iterator();
        while (itC.hasNext()) {
            System.out.println("C " + itC.next());
        }
        Iterator<Integer> itD = D.iterator();
        while (itD.hasNext()) {
            System.out.println("D " + itD.next());
        }
    }
}

// 這是優化後的版本，使用 Map 和 Set 來管理牌組
@SuppressWarnings("unused")
class ITP16B_Optimized {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Map<String, Set<Integer>> deck = new HashMap<>();

        // 初始化 4 種花色的牌
        String[] suits = {"S", "H", "C", "D"};
        for (String suit : suits) {
            Set<Integer> cards = new TreeSet<>();  // 改為 TreeSet 確保輸出順序
            for (int i = 1; i <= 13; i++) {
                cards.add(i);
            }
            deck.put(suit, cards);
        }

        // 讀取已持有的牌並移除
        int hasCard = sc.nextInt();
        for (int i = 0; i < hasCard; i++) {
            String cardSuit = sc.next();
            int cardNumber = sc.nextInt();
            deck.get(cardSuit).remove(cardNumber);
        }

        // 輸出剩下的牌
        for (String suit : suits) {
            for (int card : deck.get(suit)) {
                System.out.println(suit + " " + card);
            }
        }
        sc.close();
    }
}