package md.tekwill.demo.loops;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Happy Birthday");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Happy Birthday");
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Happy Birthday");
        }

        for (int i = 0; i <= 40; i += 10) {
            System.out.println("Happy Birthday");
        }


        int j = 0;
        for (; j <= 4; j++) {
            System.out.println("Happy Birthday");
        }

        int k;
        for (k = 0; k <= 4; k++) {
            System.out.println("Happy Birthday");
        }


        int[] array = new int[]{55, 89, 33, 41};
        //0 - 55
        //1 - 89
        //2 - 33
        //3 - 41

        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }

//        for(int i = 1; i <= 4; i++){
//            System.out.println(array[i]); //IndexOutOfBoundsException
//        }

//        for(;;){
//            System.out.println("Happy Birthday");
//        }

        int b = 3;
        for (int i = 0; i < 5; i++, b--, printFoo()) {
            System.out.println("Happy Birthday");
            System.out.println("i = " + i + ", b =" + b);
        }

        boolean running = true;
        b = 3;
        for (int i = 0; running; i++, b--, printFoo()) {
            System.out.println("Happy Birthday");
            System.out.println("i = " + i + ", b =" + b);
            if (b == 1) {
                running = false;
            }
        }

//        running = true;
//        for (int i = 0; running; i += 10000, b--, printFoo()) {
//            System.out.println("Happy Birthday");
//            System.out.println("i = " + i + ", b =" + b);
//            new Integer(i);
//        }

        int result = 0;
        for(int i = 2; i <= 9; i++)
            result += i;
        System.out.println(result);
    }




    public static void printFoo() {
        System.out.println("Foo");
    }
}
