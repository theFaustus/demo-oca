package md.tekwill.demo.methods.varargs;

class AverageCalculator {
    public static double compute(int... numbers){
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        sum /= numbers.length;
        return sum;
    }
}
