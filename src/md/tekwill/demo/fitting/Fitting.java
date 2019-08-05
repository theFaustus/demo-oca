package md.tekwill.demo.fitting;

import java.util.Scanner;

class Fitting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number >");
        Long a = in.nextLong();

        if(a > Byte.MIN_VALUE && a < Byte.MAX_VALUE){
            System.out.println(a + " fits in byte");
        }
        if(a > Short.MIN_VALUE && a < Short.MAX_VALUE){
            System.out.println(a + " fits in short");
        }
        if(a > -2147483648 && a < 2147483647){
            System.out.println(a + " fits in int");
        }
        if(a > -9223372036854775808L && a < 9223372036854775807L){
            System.out.println(a + " fits in long");
        }


    }
}
