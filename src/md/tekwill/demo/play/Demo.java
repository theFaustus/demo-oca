package md.tekwill.demo.play;

import java.time.LocalDate;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.computeSummation(624));
    }

    public double computeSummation(int limit) {
        double sum = 0;
        for (int n1 = 1, n2 = 2; n1 <= limit; n1++, n2++) {
            sum += 1 / (Math.sqrt(n1) + Math.sqrt(n2));
        }
        return sum;
    }
}