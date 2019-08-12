package md.tekwill.demo.loop.sum;

import java.util.Scanner;

class SumTracker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean running = true;
        int sum = 0;
        for (;running; ) {
            int i = in.nextInt();
            if (i != 0)
                System.out.println("Sum = " + (sum += i));
            else
                running = false;
        }
    }
}
