package md.tekwill.demo.inheritance.binding;

import java.util.ArrayList;

class Zoo {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        Animal c = new Animal();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a);
        animals.add(b);
        animals.add(c);

        System.out.println("#Methods are bound on RUN-TIME!");


        for (Animal animal : animals){
            animal.walk();
        }

        System.out.println("#Varaibles are bound on COMPILE-TIME!");

        for (Animal animal : animals){
            System.out.println(animal.name);
            animal.makeNoise();
        }

    }
}
