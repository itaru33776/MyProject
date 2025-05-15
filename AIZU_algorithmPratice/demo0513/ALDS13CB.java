package demo0513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;


//最佳解
public class ALDS13CB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 讀取命令數量
        ArrayDeque<Integer> num = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "insert" -> num.addFirst(Integer.parseInt(st.nextToken()));
                case "delete" -> num.removeFirstOccurrence(Integer.parseInt(st.nextToken()));
                case "deleteFirst" -> num.pollFirst();
                case "deleteLast" -> num.pollLast();
                default -> {
                }
            }
        }

        // 使用 StringBuilder 來提高輸出效率
        StringBuilder sb = new StringBuilder();
        for (Integer x : num) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}