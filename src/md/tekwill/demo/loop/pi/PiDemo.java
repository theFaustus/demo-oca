package md.tekwill.demo.loop.pi;

import java.util.Scanner;

class PiDemo {
    public static void main(String[] args) {
        //4 - 4/3 + 4/5 - 4/7 + 4/9
        //this goes in for 4/3 + 4/5 - 4/7 + 4/9
        //4/3 + 4/5, in iteration 0, when i is even, 0
        //(4/3 + 4/5) - 4/7, in iteration 1, when i is odd, 1
        //((4/3 + 4/5) - 4/7) + 4/9, in iteration 2, when i is even 2
        double pi = 4.0;
        double computedValue = 0;
        //i = 0 1 2 3 .... 200_000
        //j = 3 5 7 9 .... n
        for (int i = 0, j = 3; i < 200_000; i++, j += 2) {
            //check for parity
            if (i % 2 == 0)
                computedValue += 4.0 / j; //here we have just the adding part
            else
                computedValue -= 4.0 / j; //here we have just the subtracting part
        }
        System.out.println(pi - computedValue); //4 - (computedValue from for)

    }

    public double computePi(int limit){
        double pi = 4.0;
        double computedValue = 0;
        //i = 0 1 2 3 .... 200_000
        //j = 3 5 7 9 .... n
        for (int i = 0, j = 3; i < limit; i++, j += 2) {
            //check for parity
            if (i % 2 == 0)
                computedValue += 4.0 / j; //here we have just the adding part
            else
                computedValue -= 4.0 / j; //here we have just the subtracting part
        }
        return pi - computedValue; //4 - (computedValue from for)
    }

}
