package md.tekwill.demo.loop.menu;

import java.util.Scanner;

class MenuDemo {
    public static void main(String[] args) {
        boolean running = true;
        boolean inputIsIncorrect = true;

        Scanner in = new Scanner(System.in);
        char c = '0';

        while (running) {
            System.out.println("+ - add                  / - divide");
            System.out.println("- - subtract             * - multiply");
            System.out.println("Enter a letter: ");
            while (inputIsIncorrect) {
                c = in.nextLine().toLowerCase().charAt(0);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    inputIsIncorrect = false;
                } else if (c == '$') {
                    inputIsIncorrect = false;
                    running = false;
                } else {
                    System.out.println("Input not correct, enter a b c or d:");
                }
            }

            int a = 0;
            int b = 0;

            switch (c) {
                case '+':
                    System.out.println("Enter a :");
                    a = in.nextInt();
                    System.out.println("Enter b :");
                    b = in.nextInt();
                    System.out.println("Result = " + (a + b));
                    break;
                case '-':
                    System.out.println("Enter a :");
                    a = in.nextInt();
                    System.out.println("Enter b :");
                    b = in.nextInt();
                    System.out.println("Result = " + (a - b));
                    break;
                case '*':
                    System.out.println("Enter a :");
                    a = in.nextInt();
                    System.out.println("Enter b :");
                    b = in.nextInt();
                    System.out.println("Result = " + (a * b));
                    break;
                case '/':
                    System.out.println("Enter a :");
                    a = in.nextInt();
                    System.out.println("Enter b :");
                    b = in.nextInt();
                    System.out.println("Result = " + (a / b));
                    break;
            }
            in.nextLine(); // to erase new line
            inputIsIncorrect = true;

        }
    }
}
