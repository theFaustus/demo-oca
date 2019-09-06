package md.tekwill.demo.swap;

import java.util.ArrayList;
import java.util.List;

public class Demo {
//
//    public static void swap(Person p1, Person p2){
//        Person temp = p1;
//        p1 = p2;
//        p2 = temp;
//        System.out.println("swap: " + p1.getName() + " / " + p2.getName());
//    }
//

    public static void swap(Person p1, Person p2) {
        String temp = p1.name;
        p1.name = p2.name;
        p2.name = temp;
        System.out.println("swap: " + p1.getName() + " / " + p2.getName());
        System.out.println("swap: " + p1.getAge() + " / " + p2.getAge());

    }

    public static void swap(PersonWrapper p1, PersonWrapper p2) {
        Person temp = p1.person;
        p1.person = p2.person;
        p2.person = temp;
        System.out.println("swap: " + p1.getPerson().getName() + " / " + p2.getPerson().getName());
        System.out.println("swap: " + p1.getPerson().getAge() + " / " + p2.getPerson().getAge());
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 5);
        Person p2 = new Person("Mike", 10);
        System.out.println(p1.getName() + " / " + p2.getName());
        System.out.println(p1.getAge() + " / " + p2.getAge());
        swap(p1, p2);
        System.out.println(p1.getName() + " / " + p2.getName());
        System.out.println(p1.getAge() + " / " + p2.getAge());
        PersonWrapper personWrapper1 = new PersonWrapper(p1);
        PersonWrapper personWrapper2 = new PersonWrapper(p2);
        System.out.println(personWrapper1.getPerson().getName() + " / " + personWrapper2.getPerson().getName());
        System.out.println(personWrapper1.getPerson().getAge() + " / " + personWrapper2.getPerson().getAge());
        swap(personWrapper1, personWrapper2);
        System.out.println(personWrapper1.getPerson().getName() + " / " + personWrapper2.getPerson().getName());
        System.out.println(personWrapper1.getPerson().getAge() + " / " + personWrapper2.getPerson().getAge());


        List<String> bankAccounts = new ArrayList<>();
        bankAccounts.add("65464134845");
        bankAccounts.add("65464134842");
        bankAccounts.add("65464134841");
        bankAccounts.add("65464134844");


    }


}
