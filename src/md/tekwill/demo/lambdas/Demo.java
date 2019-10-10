package md.tekwill.demo.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Demo {
    public static void main(String[] args) {
        Employee e = new Employee("", "Tokyo");
        Employee e1 = new Employee("Mike", "Tokyo");
        Employee e2 = new Employee("Spike", "Tokyo");
        Employee e3 = new Employee("Tike", "Tokyo");
        Employee e4 = new Employee("Dike", "Tokyo");
        Employee e5 = new Employee("Zike", "Tokyo");
        Employee e6 = new Employee("Like", "Tokyo");
        Employee e7 = new Employee("", "Tokyo");
        Employee e8 = new Employee("Fike", "Tokyo");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);

        filter(employees, new ValidateRuleName());

        ValidateRule validateAddress = new ValidateRule() {
            @Override
            public boolean check(Employee e) {
                return e.address.length() > 2;
            }
        };

        ValidateRule validateNameV2 = (Employee emp) -> emp.name.length() > 5;

        filter(employees, validateNameV2);

        ValidateRule validateNameV3 =  emp -> emp.name.length() > 5;

        filter(employees, validateNameV3);

        filter(employees, emp -> emp.name.length() > 6);

        filter(employees, validateAddress);

        filterUpgraded(employees, employee -> employee.name.length() > 0);

        Predicate<Employee> predicateForAddress = employee -> employee.address.length() > 0;

        filterUpgraded(employees, predicateForAddress);




    }

    static void filter(List<Employee> employees, ValidateRule v){
        for (Employee e : employees){
            if (v.check(e))
                System.out.println(e);
        }
    }

    static void filterUpgraded(List<Employee> employees, Predicate<Employee> v){
        for (Employee e : employees){
            if (v.test(e))
                System.out.println(e);
        }
    }
}
