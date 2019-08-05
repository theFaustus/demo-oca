package md.tekwill.staticdemo;

class StaticDemo {
    static int staticVariable = 0;
    int instanceVariable = 2;

    public static void main(String[] args) {
        StaticDemo d = new StaticDemo();
        StaticDemo f = new StaticDemo();
        StaticDemo g = new StaticDemo();
        StaticDemo h = new StaticDemo();

        System.out.println("\nstatic no changes");
        System.out.print(" " + d.staticVariable);
        System.out.print(" " + d.staticVariable);
        System.out.print(" " + f.staticVariable);
        System.out.print(" " + g.staticVariable);
        System.out.println("\ninstance no changes");
        System.out.print(" " + d.instanceVariable);
        System.out.print(" " + h.instanceVariable);
        System.out.print(" " + f.instanceVariable);
        System.out.print(" " + g.instanceVariable);

        d.staticVariable = 4;
        d.instanceVariable = 3;
        g.instanceVariable = 5;
        System.out.println("\nstatic a = 4");
        System.out.print(" " + d.staticVariable);
        System.out.print(" " + h.staticVariable);
        System.out.print(" " + f.staticVariable);
        System.out.print(" " + g.staticVariable);
        System.out.println("\ninstance, just d changed b = 3 and g changed b = 5");
        System.out.print(" " + d.instanceVariable);
        System.out.print(" " + h.instanceVariable);
        System.out.print(" " + f.instanceVariable);
        System.out.print(" " + g.instanceVariable);
    }
}
