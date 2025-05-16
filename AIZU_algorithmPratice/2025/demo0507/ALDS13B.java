package demo0507;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ALDS13B {
    public static void main(String[] args) {
        /* 
         * もしある入力資料が複数のデータ型を持つ場合、
         * 単純ななデータ型の配列をこだわらないで、
         * クラスを作成して、データ型をまとめてしまうのが良い。
         */
        class Process {
            String name; //プロセス名
            int time; //プロセスの実行時間
    
            public Process(String name, int time) {
                this.name = name;
                this.time = time;
            }
        }
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        //最初の行に、プロセス数を表す整数 n とクオンタムを表す整数 q が１つの空白区切りで与えられます。
        //続く n 行で、各プロセスの情報が順番に与えられます。文字列 namei と整数 timei は１つの空白で区切られています。
        int n = sc.nextInt(); //プロセス数
        int q = sc.nextInt(); //クオンタム
        
        Queue<Process> time = new LinkedList<>(); //プロセスの実行時間

        int allTime = 0; //全てのプロセスの実行時間

        for (int i = 0; i < n; i++) {
            String name = sc.next(); //プロセス名
            int timei = sc.nextInt(); //プロセスの実行時間
            time.offer(new Process(name, timei)); //プロセスをキューに追加
        }
        while (!time.isEmpty()) { //キューが空でない限り
            Process p = time.poll(); //キューの先頭のプロセスを取り出す
            if (p.time > q) { //プロセスの実行時間がクオンタムより大きい場合
                allTime += q; //全てのプロセスの実行時間にクオンタムを加算
                p.time -= q; //プロセスの実行時間からクオンタムを減算
                time.offer(p); //プロセスをキューに追加
            } else { //プロセスの実行時間がクオンタム以下の場合
                allTime += p.time; //全てのプロセスの実行時間にプロセスの実行時間を加算
                System.out.println(p.name + " " + allTime); //プロセス名と全てのプロセスの実行時間を出力
            }
        }
        sc.close(); //Scannerを閉じる
    }
}