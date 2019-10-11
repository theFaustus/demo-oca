package md.tekwill.demo.exceptions.trace;

class Example {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    private static void method2() {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[5]);
    }
}
