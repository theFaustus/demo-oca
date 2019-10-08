package md.tekwill.demo.inheritance.interfaces.printableinterface;

class SportCar implements Printable, InterfaceS1, InterfaceS2 {
    private String name;
    private long vinCode;

    public SportCar(String name, long vinCode) {
        this.name = name;
        this.vinCode = vinCode;
        InterfaceS1.bar();
        InterfaceS2.bar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVinCode() {
        return vinCode;
    }

    public void setVinCode(long vinCode) {
        this.vinCode = vinCode;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", vinCode=" + vinCode +
                '}';
    }

    @Override
    public void print() {
        System.out.println("*****************************");
        System.out.println("Car name > " + name);
        System.out.println("Car vinCode > " + vinCode);
        System.out.println("*****************************");
    }
}
