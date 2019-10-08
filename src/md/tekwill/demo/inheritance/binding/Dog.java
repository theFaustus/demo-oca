package md.tekwill.demo.inheritance.binding;

class Dog extends Animal {
    String name = "K9";

    @Override
    public void makeNoise() {
        System.out.println("Woof, woof!");
    }

    @Override
    public void walk(){
        System.out.println(name + " leaving dog`s footprint...");
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
