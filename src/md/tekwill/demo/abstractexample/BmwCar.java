package md.tekwill.demo.abstractexample;

class BmwCar extends Car {
    private String mpower = "M";

    public BmwCar(String engine, String fuel, String gearbox){
        super(engine, fuel, gearbox);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelarating with 140km/h");
    }

    @Override
    public String toString() {

        return "AudiCar{" +
                "engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", mpower='" + mpower + '\'' +
                '}';
    }
}
