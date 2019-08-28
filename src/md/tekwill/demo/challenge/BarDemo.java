package md.tekwill.demo.challenge;

class BarDemo {
    public static void main(String[] args) {
        Bar b = new Bar();
        System.out.println(b.getFoo());
        b.setFoo(24);
        System.out.println(b.getFoo());
        System.out.println(Bar.text);
        System.out.println(Bar.add(4, 5));
        System.out.println(Bar.add(6.3, 5.4));
        short a = 1;
        short a2 = 2;
        byte d = 2;
        byte d1 = 2;
        byte d2 = 2;
        System.out.println(Bar.getAverage((short) 2, a2));
        System.out.println(Bar.getAverage(d, d1, (byte) 3));
        System.out.println(Bar.getAverage(4.7, 6.7, 9.8, 24.8));
        System.out.println(Bar.getAverage(2400000000000000000L, 2400000000000000000L));
        System.out.println(Bar.getAverage(240000000000000000.0, 240000000000000000.0));


    }
}
