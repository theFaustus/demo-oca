package md.tekwill.demo.abstractexample;

class AudiCar extends Car {
    private String allWheelDrive = "Quattro";

    public AudiCar(String engine, String fuel, String gearbox){
        super(engine, fuel, gearbox);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelarating with 120km/h");
    }

    @Override
    public String toString() {

        return "AudiCar{" +
                "engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", allWheelDrive='" + allWheelDrive + '\'' +
                '}';
    }
}
