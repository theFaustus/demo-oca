package md.tekwill.demo.methods.varargs;

class Demo {
    public static void main(String[] args) {
        System.out.println(AverageCalculator.compute(1, 2, 3));
        System.out.println(AverageCalculator.compute(15));
        System.out.println(AverageCalculator.compute());
        System.out.println(AverageCalculator.compute(new int[]{2, 3, 4}));

//
//        double[] array;
//        array = new double[50];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = AverageCalculator.compute(i, i * 2, (int) Math.pow(i, 3));
//            System.out.println(array[i]);
//        }

    }
}
