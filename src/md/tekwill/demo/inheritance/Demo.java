package md.tekwill.demo.inheritance;

import java.util.ArrayList;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        String[] programmingLanguages = new String[]{"Java", "Groovy"};

        Manager m = new Manager("John", "Toronto", 5);
        Programmer p = new Programmer("Mike", "New York", programmingLanguages);
        Programmer p1 = new Programmer("Spike", "New York City", "Java");
        Programmer p2 = new Programmer("Zike", "New York", "Java", "C++");
        Programmer p3 = new Programmer("Zike", "New York", "Java", "C++");
        Programmer p4 = new Programmer("Zike", "New York", "Java", "C++");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(m);
        employees.add(p);
        employees.add(p1);
        employees.add(p2);
        employees.add(p3);
        employees.add(p4);

        HR hr = new HR();
        hr.sendInvitation(m);
        hr.sendInvitation(p);

        System.out.println();

        for (Employee e : employees) {
            hr.sendInvitation(e);
        }

        System.out.println(m);
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        Employee e = new Programmer("Peter", "New York", "Java", "C++");
        Employee f = new Manager("Duke", "New York", 2);
        Employee g = new Employee("Bob", "Moldova");

        employees.add(e);
        employees.add(g);
        employees.add(f);

        System.out.println();
        for (Employee k : employees){
            hr.sendInvitation(k);
        }

    }
}
