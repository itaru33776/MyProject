package demo0430;

import java.util.Scanner;
import java.util.Stack;

public class ALDS13A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                // 是數字就放進堆疊
                stack.push(sc.nextInt());
            } else {
                // 是運算符就彈出兩個數字來計算
                String op = sc.next();
                int b = stack.pop(); // 注意：先彈出的應該是右側操作數
                int a = stack.pop(); // 再彈出左側操作數
                
                // 執行計算並把結果推回堆疊
                switch (op) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    default -> throw new IllegalArgumentException("Unsupported operator: " + op);
                }
            }
        }
        
        // 最後堆疊內應該只剩一個結果
        System.out.println(stack.pop());
    }
}
