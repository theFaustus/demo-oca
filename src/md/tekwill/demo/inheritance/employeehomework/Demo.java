package md.tekwill.demo.inheritance.employeehomework;

import java.time.LocalDate;

class Demo {
    public static void main(String[] args) {
        Employee e = new Employee("Mike");
        Employee e1 = new Employee("Mike", "123-B", LocalDate.now());
        Employee e21 = new Employee("Mike", "123-BHHH", LocalDate.now());
        Employee e22 = new Employee("Mike", "123-Z", LocalDate.now());
        Employee e23 = new Employee("Mike", "123#B", LocalDate.now());
        Employee e24 = new Employee("Mike", "1B3-A", LocalDate.now());
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e21);
        System.out.println(e22);
        System.out.println(e23);
        System.out.println(e24);

        Employee ee = new Employee("John", LocalDate.now());
        System.out.println(ee);
        Employee em = new ProductionWorker("John", LocalDate.now(), 0, 8);
        System.out.println(em);
        Employee m = new SuperProductionWorker("John", "Punisher", LocalDate.now(), 0, 8);
        System.out.println(m);

        ((ProductionWorker) em).getHourlyPayRate();
        //((SuperProductionWorker) em).getNickname();
        ((ProductionWorker) m).getHourlyPayRate();
    }
}
