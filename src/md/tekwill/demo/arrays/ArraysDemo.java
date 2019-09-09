package md.tekwill.demo.arrays;

import java.util.Random;

class ArraysDemo {
    public static void main(String[] args) {
        //declaration
        int[] intArray; // preferred
        char charArray[];
        String[] stringArray;

        int[][] intBiArray;

        //allocation
        intArray = new int[10];
        charArray = new char[4];
        stringArray = new String[3];

        intBiArray = new int[3][4];
            //expressions that result in int
        int arrayLength = 3 * 4;
        intArray = new int[arrayLength];
        charArray = new char[getRandomNumber()];
        stringArray = new String[Math.max(2, 4)];
        int rows = 2; //input from user, rows
        int cols = 4; //input from user, columns
        intBiArray = new int[rows][cols];
        intBiArray = new int[rows][];
        intBiArray[0] = new int[4];
        intBiArray[1] = new int[10];

        intBiArray[0][2] = 4;
        intBiArray[1][6] = 8;

        for(int i = 0; i < arrayLength; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        //preferred method of iterating through an array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }


    }

    public static int getRandomNumber(){
        return new Random().nextInt(5) + 1;
    }
}
