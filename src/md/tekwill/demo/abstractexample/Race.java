package md.tekwill.demo.abstractexample;

public class Race {
    public static void main(String[] args) {
        AudiCar audiA6 = new AudiCar("V6", "Gas", "Auto");
        AudiCar audiA7 = new AudiCar("V8", "Gas", "Mechanic");
        AudiCar audiA8 = new AudiCar("V10", "Gas", "Auto");
        System.out.println("Race started by > " + audiA6);
        System.out.println("Race started by > " + audiA7);
        System.out.println("Race started by > " + audiA8);
        audiA6.accelerate();
        BmwCar bmw7 = new BmwCar("V6", "Gas", "Auto");
        BmwCar bmw3 = new BmwCar("V8", "Gas", "Mechanic");
        bmw3.accelerate();
    }
}
