package org.example.lesson04;

public class LoopsDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("for i = " + i);
        }

        int w = 1;
        while (w <= 5) {
            System.out.println("while w = " + w);
            w++;
        }

        int d = 1;
        do {
            System.out.println("do-while d = " + d);
            d++;
        } while (d <= 5);

        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println("break demo: " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println("continue demo: " + i);
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "x" + j + " ");
            }
            System.out.println();
        }
    }
}
