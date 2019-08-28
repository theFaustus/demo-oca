package md.tekwill.demo.constructors;

class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c);
        Cat mike = new Cat(29, "Mike", "Blue");
        System.out.println(mike);
        Cat spike = new Cat(29, "Spike", "Blue", "Scottish");
        System.out.println(spike);
    }
}
