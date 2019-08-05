package md.tekwill.demo.abstractexample;

public abstract class Car {
    protected String engine;
    protected String fuel;
    protected String gearbox;
    protected String name;

    Car(){

    }

    Car(String engine, String fuel, String gearbox){
        this.engine = engine;
        this.fuel = fuel;
        this.gearbox = gearbox;
    }

    public abstract void accelerate();

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", gearbox='" + gearbox + '\'' +
                '}';
    }
}
