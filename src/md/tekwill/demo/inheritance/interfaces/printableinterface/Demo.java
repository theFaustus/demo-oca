package md.tekwill.demo.inheritance.interfaces.printableinterface;

class Demo {
    public static void main(String[] args) {
        Printable[] thingsToPrint = new Printable[]{
                new Manager("1894313", "Mike"),
                new Rectangle(12, 23),
                new SportCar("Mazda", 78945646L)
        };

        int[] arr; //declaration
        arr = new int[5]; //allocation
        for (int i = 0; i < arr.length; i++) { //initialization
            arr[i] = i;
        }

        int[] arr1 = new int[]{1, 2, 3, 4};

        int[] arr2;
        arr2 = new int[]{2};

        int[] arr3 = {4, 4};

        for (Printable p : thingsToPrint) {
            p.print();
        }
    }
}
