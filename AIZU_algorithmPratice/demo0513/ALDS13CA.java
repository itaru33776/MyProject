package demo0513;

import java.util.LinkedList;
import java.util.Scanner;

//非最佳解，速度瓶頸出在Scanner。
// 當需要大量的I/O時，Scanner的性能會受到影響。
// 使用BufferedReader和StringTokenizer可以提高性能。
public class ALDS13CA {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 有幾個命令
        LinkedList<Integer> num = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next(); // 命令
            switch (command) {
                case "insert":
                    {
                        int x = sc.nextInt(); // 要插入的數字
                        num.addFirst(x);
                        break;
                    }
                case "delete":
                    {
                        int x = sc.nextInt(); // 要刪除的數字
                        num.remove(Integer.valueOf(x));
                        break;
                    }
                case "deleteFirst":
                    num.removeFirst();
                    break;
                case "deleteLast":
                    num.removeLast();
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < num.size(); i++) {
            if (num.size() == 1 || i == num.size() - 1) {
                System.out.print(num.get(i));
                break;
            }
            System.out.print(num.get(i) + " ");
        }
        System.out.println();
    }
}
