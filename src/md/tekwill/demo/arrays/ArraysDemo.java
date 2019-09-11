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
        intBiArray[0] = new int[10];
        intBiArray[1] = new int[10];

        intBiArray[0][2] = 4;
        intBiArray[1][6] = 8;

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        //preferred method of iterating through an array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        intBiArray = new int[10][10];
        //initialization
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * i;
        }

        for (int i = 0; i < intBiArray.length; i++) {
            for (int j = 0; j < intBiArray[i].length; j++) {
                intBiArray[i][j] = i * j;
            }
        }

        //iterating
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < intBiArray.length; i++) {
            for (int j = 0; j < intBiArray[i].length; j++) {
                System.out.print(intBiArray[i][j] + " ");
            }
            System.out.println();
        }

        //combo

        int[] comboIntArray = new int[]{1, 2, 3, 4, 5};
        int[][] comboBiIntArray = new int[][]{{1, 2}, {3, 4, 5}};
        String[] comboStringArray = new String[]{"A", "B", "C"};
        String[][] comboBiStringArray = {{"A"}, {"B", "D"}, {"C"}};





    }

    public static int getRandomNumber() {
        return new Random().nextInt(5) + 1;
    }
}
