package md.tekwill.demo.decision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        int a = -1;

        int countOfPositiveNumbers = 1;

        //good example but watch out for the executed statements
        if (countOfPositiveNumbers > 0
                && countOfPositiveNumbers > 0
                && countOfPositiveNumbers > 0)
            countOfPositiveNumbers++; //just this one is part of if
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
// Bad example watch out for if without else
//        if (countOfPositiveNumbers > 0
//                && countOfPositiveNumbers > 0
//                && countOfPositiveNumbers > 0)
//            countOfPositiveNumbers++;
//        countOfPositiveNumbers++;
//        countOfPositiveNumbers++;
//        countOfPositiveNumbers++;
//        countOfPositiveNumbers++;
//        countOfPositiveNumbers++;
//        else
//            countOfPositiveNumbers++;

        // good example but watch out for the executed statements
        if (countOfPositiveNumbers > 0
                && countOfPositiveNumbers > 0
                && countOfPositiveNumbers > 0)
            countOfPositiveNumbers++;
        else
            countOfPositiveNumbers++; //just this is part of else
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;
        countOfPositiveNumbers++;


        Integer n = 2;
        Integer n2 = 23;

        if (n.equals(n2))
            n += 2;
        else
            n += 3;

        if (n.equals(n2)) {
            n += 2;
            n += 2;
        } else
            n += 3;

        if (n.equals(n2))
            n += 2;
        else {
            n += 3;
            n += 3;
        }

        if (n.equals(n2)) {
            n += 2;
        } else {
            n += 3;
            n += 3;
        }

        Scanner in = new Scanner(System.in);
        //n = in.nextInt();
        //n2 = in.nextInt();
        boolean allow = n.equals(n2);
        if (allow == true) //allow = true assignment
        {
            System.out.println(allow);
        } else {
            System.out.println("false");
        }
        System.out.println(countOfPositiveNumbers);

        if (n.equals(n2)) {
            if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else if (n.equals(n2))
                n += 2;
            else
                n += 3;
        } else
            n += 7;

        int discount = 15;
        if (discount > 10)
            discount = 5;
        else
            discount = 3;

        discount = (discount > 10) ? 5 : 3;

        String result = "";
        if (discount % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.println(result);

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroes = 0;

        if (a > 0) {
            positiveNumbers++;
        } else if (a < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }

        System.out.println(a > 0 ? positiveNumbers++ : a < 0 ? negativeNumbers++ : zeroes++);

        System.out.println(discount % 2 == 0 ? "even" : "odd");


        System.out.print("Enter a degrees in Celsius: ");
        double celsius = in.nextDouble();
        Double fahrenheit = 9.0 / 5 * celsius + 32;
        if (celsius % (int) celsius == 0) {
            System.out.println(((int) celsius) + " " + fahrenheit);
        } else {
            System.out.println(celsius + " " + fahrenheit);
        }

        System.out.println((celsius % (int) celsius == 0 ? ((int) celsius) : celsius) + " " + fahrenheit);

        String day = "MON";
        switch (day) {
            case "MON":
                System.out.println("Working!");
            case "TUE":
                System.out.println("Working!");
            case "WED":
                System.out.println("Working!");
            case "THU":
                System.out.println("Working!");
                break;
            case "FRI":
                System.out.println("Near weekend!");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Drinking!");
                break;
            default:
                System.out.println("Not a day!");
                break;
        }


        day = "MTE";
        switch (day) {
            case "MON":
                System.out.println("Working!");
            case "TUE":
                System.out.println("Working!");
            case "WED":
                System.out.println("Working!");
            case "THU":
                System.out.println("Working!");
                break;
            case "FRI":
                System.out.println("Near weekend!");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Drinking!");
                break;
            default:
                System.out.println("Not a day!");
                break;
        }


        day = "TUE";
        switch (day) {
            case "MON":
                System.out.println("Working on monday!");
            case "TUE":
                System.out.println("Working on tuesday!");
                break;
            case "WED":
                System.out.println("Working on wednesday!");
            case "THU":
                System.out.println("Working on thursday!");
                break;
            case "FRI":
                System.out.println("Near weekend!");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Drinking!");
                break;
            default:
                System.out.println("Not a day!");
                break;
        }


        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(new Integer(2));
        listOfInteger.add(3);
        listOfInteger.add(4);

        for (int i = 0; i < listOfInteger.size(); i++) {
            switch (listOfInteger.get(i)) {
                case 1:
                    System.out.println("Packet A");
                    break;
                case 2:
                    System.out.println("Packet B");
                    break;
                case 3:
                    System.out.println("Packet C");
                    break;
                case 4:
                    System.out.println("Packet D");
                    break;
                default:
                    System.out.println("Not a packet");
                    break;
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter from the phone's key pad :");
        char letter = input.next().toLowerCase().charAt(0);
        if (letter == 'a' || letter == 'b' || letter == 'c')
            System.out.println("The corresponding number is 2");
        if (letter == 'd' || letter == 'e' || letter == 'f')
            System.out.println("The corresponding number is 3");
        if (letter == 'g' || letter == 'h' || letter == 'i')
            System.out.println("The corresponding number is 4");
        if (letter == 'j' || letter == 'k' || letter == 'l')
            System.out.println("The corresponding number is 5");
        if (letter == 'm' || letter == 'n' || letter == 'o')
            System.out.println("The corresponding number is 6");
        if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's')
            System.out.println("The corresponding number is 7");
        if (letter == 't' || letter == 'u' || letter == 'v')
            System.out.println("The corresponding number is 8");
        if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z')
            System.out.println("The corresponding number is 9");


        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            printChart(number);
        }

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        printChart(number1);
        printChart(number2);
        printChart(number3);
        printChart(number4);
        printChart(number5);
    }

    private static void printChart(int numberOfStars) {
        for (int j = 0; j < numberOfStars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
