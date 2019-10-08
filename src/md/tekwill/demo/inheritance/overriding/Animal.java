package md.tekwill.demo.inheritance.overriding;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public void walk(){
        System.out.println("Leaving footprints...");
    }

}
