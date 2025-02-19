package demo_0106;

import java.util.ArrayList;


class Demo02 {
    //解蟲食算題目
    public static void main(String[] args) {
        int t = 0;
        ArrayList<Integer> aw1 = new ArrayList<>();
        ArrayList<Integer> aw2 = new ArrayList<>();

        for (int i = 20; i <= 29;i++) {
            for (int j = 10; j <= 50; j++) {
                if (i*j < 1000) {
                    int p = (i*j)/10;
                    if (p%10 == 4) {
                        t++;
                        System.out.println("i ="+i+" j ="+j+" "+(i*j));
                        aw1.add(i);
                        aw2.add(j);
                    }
                }
            }
        }
        System.out.println("總共有"+t+"個答案符合");
        t = 0;
        for (int i = 0; i < 33; i++) {
            int p1 = aw1.get(i);
            int p2 = aw2.get(i)%10;
            int p3 = (p1*p2)/10;
            if ( p3%10 == 3) {
                t++;
                System.out.println("i ="+aw1.get(i)+" j ="+aw2.get(i)+" "+(aw1.get(i)*aw2.get(i)));
            }
        }
        System.out.println("總共有"+t+"個答案符合");
    }
}