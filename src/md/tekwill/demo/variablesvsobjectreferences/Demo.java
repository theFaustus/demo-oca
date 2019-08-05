package md.tekwill.demo.variablesvsobjectreferences;

import java.util.Objects;
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        final int copyOfB = b;
        //int c = a - ++b;
        //1 ++b <=> b = b + 1;
        //2 c = a - b;
        //;
        //int c1 = a - b++;
        //1 c1 = a - b
        //2 b = b + 1
        // System.out.println(b);
        //;
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
//        System.out.println(b);
//        b++;
//        System.out.println(b);
//        System.out.println(b++);
//        System.out.println(++b);

        b = b++ + b + b-- - b-- + ++b;
        b += 1; //b = b + 1
        b /= 3; //b = b / 3
        b *= 2;
        b -= 1;
        System.out.println(b);


    }
}
