package demo0516;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class ALDS13D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String terrain = scanner.next();
        scanner.close();

        Stack<Integer> posStack = new Stack<>(); // 儲存 '\' 的索引
        Stack<int[]> layerStack = new Stack<>(); // 儲存水坑的範圍 (起點, 面積)
        int totalArea = 0;

        List<Integer> areas = new ArrayList<>();

        for (int i = 0; i < terrain.length(); i++) {
            char c = terrain.charAt(i);

            if (c == '\\') {
                posStack.push(i); // 記錄下降斜坡的位置
            } else if (c == '/' && !posStack.isEmpty()) {
                int start = posStack.pop(); // 找到對應的 '\'
                int area = i - start; // 計算水坑面積
                totalArea += area;

                // 合併水坑
                while (!layerStack.isEmpty() && layerStack.peek()[0] > start) {
                    area += layerStack.pop()[1];
                }

                layerStack.push(new int[]{start, area});
            }
        }

        while (!layerStack.isEmpty()) {
            areas.add(layerStack.pop()[1]);
        }
        Collections.reverse(areas);

        // 輸出結果
        System.out.println(totalArea);
        System.out.print(areas.size());
        for (int a : areas) {
            System.out.print(" " + a);
        }
        System.out.println();
    }
}