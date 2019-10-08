package md.tekwill.demo.inheritance.overriding;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof, woof!");
    }

    @Override
    public void walk(){
        System.out.println("Leaving dog`s footprint...");
    }

    public void lovePeople(){
        System.out.println("Loving...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
