package md.tekwill.demo.loop.sum;

import java.util.Scanner;

class SumBetweenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
