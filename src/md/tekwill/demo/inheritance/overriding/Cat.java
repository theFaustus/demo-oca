package md.tekwill.demo.inheritance.overriding;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void walk(){
        System.out.println("Leaving cat`s footprints...");
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
