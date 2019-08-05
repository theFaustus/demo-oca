package md.tekwill.demo.uninitialized;

class Demo {
    int a;
    char b;
    boolean c;
    Short aShort;
    String s;

    public static void main(String[] args) {
        Demo d = new Demo();

        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
        System.out.println(d.aShort);
        System.out.println(d.s);


    }
}
