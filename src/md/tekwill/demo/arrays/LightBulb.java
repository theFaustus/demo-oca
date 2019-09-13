package md.tekwill.demo.arrays;

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Lightbulb is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lightbulb is turned off");
    }
}
