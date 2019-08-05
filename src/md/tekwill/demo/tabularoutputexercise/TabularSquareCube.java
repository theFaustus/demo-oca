package md.tekwill.demo.tabularoutputexercise;

class TabularSquareCube {
    public static void main(String[] args) {
        //
        System.out.printf("%2$-10s%3$-10s%1$-10s\n", "numbers", "square", "cube");
        System.out.printf("%-10d%-10d%-10d\n", 1, (int) Math.pow(1, 2), (int) Math.pow(1, 3));
        System.out.printf("%-10d%-10d%-10d\n", 2, 2 * 2, 2 * 2 * 2);
        System.out.printf("%-10d%-10.2f%-10.2f\n", 3, Math.pow(3, 2), Math.pow(3, 3));

        double b = 3.159159;
        System.out.printf("%.2f\n",b);
        System.out.printf("%.3f\n",b);
        System.out.printf("%.4f\n",b);


    }
}
