package demo0427;

import java.util.*;

class Card {
    String suit;
    int value;
    int index; // 記錄原始輸入位置

    Card(String card, int index) {
        this.suit = card.substring(0, 1);
        this.value = Integer.parseInt(card.substring(1));
        this.index = index;
    }

    @Override
    public String toString() {
        return suit + value;
    }
}

public class ALDS12C {
    public static void bubbleSort(Card[] cards) {
        int n = cards.length;
        Card[] originalOrder = Arrays.copyOf(cards, n); // 複製原始順序
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (cards[j].value > cards[j + 1].value) {
                    Card temp = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = temp;
                }
            }
        }
        printResult(cards, originalOrder);
    }

    public static void selectionSort(Card[] cards) {
        int n = cards.length;
        Card[] originalOrder = Arrays.copyOf(cards, n); // 複製原始順序
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (cards[j].value < cards[minIndex].value) {
                    minIndex = j;
                }
            }
            Card temp = cards[i];
            cards[i] = cards[minIndex];
            cards[minIndex] = temp;
        }
        printResult(cards, originalOrder);
    }

    // 判斷排序是否穩定
    // 判斷排序是否穩定
    public static void printResult(Card[] sortedCards, Card[] originalCards) {
        // 修正輸出格式，移除多餘的符號
        String result = Arrays.toString(sortedCards)
                          .replace("[", "")
                          .replace("]", "")
                          .replace(",", "");
        System.out.println(result);

        if (isStable(sortedCards, originalCards)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }

    public static boolean isStable(Card[] sortedCards, Card[] originalCards) {
        Map<Integer, Queue<String>> originalOrderMap = new HashMap<>();
        for (Card card : originalCards) {
            originalOrderMap.putIfAbsent(card.value, new LinkedList<>());
            originalOrderMap.get(card.value).add(card.suit);
        }

        for (Card card : sortedCards) {
            if (!card.suit.equals(originalOrderMap.get(card.value).poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 讀取卡片數量
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next(); // 讀取每張卡片
        }
        Card[] cards = new Card[input.length];
        for (int i = 0; i < input.length; i++) {
            cards[i] = new Card(input[i], i);
        }

        bubbleSort(Arrays.copyOf(cards, cards.length)); // 執行氣泡排序
        selectionSort(Arrays.copyOf(cards, cards.length)); // 執行選擇排序
    }
}
