package md.tekwill.demo.play;

import java.time.LocalDate;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        for (int i = 100, j = 0; i < 100_000; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.printf("%-8d", i);
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
        }


        int i = 100;
        int j = 0;
        while (i < 100000){
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.printf("%-8d", i);
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
            i++;
        }


        i = 100;
        j = 0;
        do {
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.printf("%-8d", i);
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }
            i++;
        } while (i < 100000);
    }
}
