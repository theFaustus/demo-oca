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
        int secondIntArray[] = new int[arrayLength];
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


        LightBulb b = new LightBulb();
        TV t = new TV();
        Radio r = new Radio();

        Switchable radio = new Radio();
        Switchable tv = new TV();
        Switchable lightBulb = new LightBulb();

        Startable microwave = new Microwave();
        Startable washmachine = new Washmachine();

        Switchable[] allDevices = new Switchable[]{radio, tv, lightBulb};
        Startable[] allStartableDevices = new Startable[]{microwave, washmachine};

        for (int i = 0; i < allDevices.length; i++) {
            allDevices[i].turnOn();
            allDevices[i].turnOff();
        }

        for (int i = 0; i < allStartableDevices.length; i++) {
            allStartableDevices[i].run();
            allStartableDevices[i].stop();
        }

        Hatchback h = new Hatchback();
        h.drive();
        h.lock();
        h.unlock();

        Car hatchback = new Hatchback();
        Car sedan = new Sedan();

        Car[] cars = new Car[]{hatchback, sedan};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
            cars[i].lock();
            cars[i].unlock();
        }

        for (Car c : cars) {
            c.unlock();
            c.drive();
            System.out.println(c);
        }

        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }

        int counter = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            sum += secondIntArray[i];
            if(intArray[i] < secondIntArray[i])
                counter++;

        }

        Object[] allWeirdUnrelatedObjects = new Object[]{radio, microwave, t, hatchback, cars};
        ((Radio) allWeirdUnrelatedObjects[0]).turnOn();

        for (int i = 0; i < allWeirdUnrelatedObjects.length; i++) {
            System.out.println(allWeirdUnrelatedObjects[i]);
        }

        Object o = "";
        Object z = 0;
        Object n = new Hatchback();
        System.out.println("=============================");
        int[] arrayOfNumbers = new int[17];
        ArrayUtils.intializeElementsFiveByFive(arrayOfNumbers, 8);

        for (int number : arrayOfNumbers){
            System.out.print(number + " ");
        }

    }

    public static int getRandomNumber() {
        return new Random().nextInt(5) + 1;
    }
}
