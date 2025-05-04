package demo0503;

import java.util.Scanner;


class ITP15A {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }else {
                
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {System.out.print("#");}
                    System.out.println();
                }
                System.out.println();
            }
        }
        scanner.close();
    }

}