package md.tekwill.demo.loop.pi;

class PiPlayground {
    public static void main(String[] args) {
        PiDemo p = new PiDemo();
        System.out.println(p.computePi(200));
        System.out.println(p.computePi(2000000));
        System.out.println(p.computePi(200000000));
        System.out.println(p.computePi(2000000000));
    }
}
