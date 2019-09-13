package md.tekwill.demo.arrays;

class Washmachine implements Startable {
    @Override
    public void run() {
        System.out.println("Washmachine.run");
    }

    @Override
    public void stop() {
        System.out.println("Washmachine.stop");
    }
}
