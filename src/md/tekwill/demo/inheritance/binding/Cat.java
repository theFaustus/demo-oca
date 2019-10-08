package md.tekwill.demo.inheritance.binding;

class Cat extends Animal {
    String name = "Cheshire";

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void walk(){
        System.out.println(name + " leaving cat`s footprints...");
    }

    public void annoyPeople(){
        System.out.println("Annoying...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
