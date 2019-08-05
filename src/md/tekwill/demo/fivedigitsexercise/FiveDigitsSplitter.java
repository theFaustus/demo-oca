package md.tekwill.demo.fivedigitsexercise;

import java.util.Scanner;

class FiveDigitsSplitter {
    public static void main(String[] args) {
        int fiveDigitsInteger;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        int fifthDigit;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter please a five digits integer > ");
        fiveDigitsInteger = in.nextInt();

        fifthDigit = fiveDigitsInteger % 10;
        fourthDigit = (fiveDigitsInteger / 10) % 10;

        //42239 % 10 = 9
        //4223 9 -> 42239 /10 -> 4223 % 10 = 3

        System.out.println(fifthDigit);
        System.out.println(fourthDigit);


    }

}
