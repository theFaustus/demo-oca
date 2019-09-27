package md.tekwill.demo.enums;

class IceCreamDemo {
    public static void main(String[] args) {
        System.out.println(IceCream.VANILLA);
        System.out.println(IceCream.VANILLA.getColor());
        System.out.println(IceCream.values());
        for (IceCream i : IceCream.values())
            System.out.println(i);
    }

}
