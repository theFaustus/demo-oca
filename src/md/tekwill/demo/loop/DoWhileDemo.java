package md.tekwill.demo.loop;

import java.util.Scanner;

class DoWhileDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exitSelected = false;
        String phrase = "";
        int demoWhile = 0;
        int demoDoWhile = 0;

        System.out.println("Do While example ");
//        do {
//            System.out.println("Enter a phrase > ");
//            phrase = in.nextLine();
//            if(phrase.toLowerCase().equals("exit")){
//                exitSelected = true;
//            } else {
//                System.out.println("Entered [" + phrase + "]");
//            }
//            demoDoWhile++;
//        } while (exitSelected == false);
//
//
//        System.out.println("While example ");
//        exitSelected = false;
//
//        while (exitSelected == false){
//            System.out.println("Enter a phrase > ");
//            phrase = in.nextLine();
//            if(phrase.toLowerCase().equals("exit")){
//                exitSelected = true;
//            } else {
//                System.out.println("Entered [" + phrase + "]");
//            }
//            demoWhile++;
//        }
//
//        System.out.println("Demo do while " + demoDoWhile);
//        System.out.println("Demo while " + demoWhile);


        boolean running = false;
        // difference will run at least one time, despite of the boolean = false
//        System.out.println("Welcome to echo program ");
//        do {
//            System.out.println("Do you want to play? [y,n] ");
//            phrase = in.nextLine();
//            if(phrase.toLowerCase().charAt(0) == 'y'){
//                System.out.println("Enter a phrase >");
//                phrase = in.nextLine();
//                System.out.println("Entered [" + phrase + "]");
//                running = true;
//            } else {
//                running = false;
//                System.out.println("Bye, bye");
//            }
//        } while (running);

// difference won`t run at least one time, despite of the boolean = false
        System.out.println("While example ");
        running = false;

//        while (running){
//            System.out.println("Do you want to play? [y,n] ");
//            phrase = in.nextLine();
//            if(phrase.toLowerCase().charAt(0) == 'y'){
//                System.out.println("Enter a phrase >");
//                phrase = in.nextLine();
//                System.out.println("Entered [" + phrase + "]");
//                running = true;
//            } else {
//                running = false;
//                System.out.println("Bye, bye");
//            }
//        }
//
//
//        System.out.println("While example ");
//        running = true;
//
//        while (running){
//            System.out.println("Do you want to play? [y,n] ");
//            phrase = in.nextLine();
//            if(phrase.toLowerCase().charAt(0) == 'y'){
//                System.out.println("Enter a phrase >");
//                phrase = in.nextLine();
//                System.out.println("Entered [" + phrase + "]");
//                running = true;
//            } else {
//                running = false;
//                System.out.println("Bye, bye");
//            }
//        }

//        int num = 10;
//        int max = 20;
//        do {
//            System.out.println("Before ++ " + num + " > " + max + " = " + (num > max));
//            num++;
//            System.out.println("After ++ " + num + " > " + max + " = " + (num > max));
//        } while (++num > max);
//        System.out.println("After do while " + num + " > " + max + " = " + (num > max));
//
//
//        num = 10;
//        max = 20;
//        while (++num > max){
//            System.out.println("Before ++ " + num + " > " + max + " = " + (num > max));
//            num++;
//            System.out.println("After ++ " + num + " > " + max + " = " + (num > max));
//        }
//        System.out.println("After while " + num + " > " + max + " = " + (num > max));

    }


}
