package md.tekwill.demo.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class Demo2 {
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

        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().name.length() == 0)
                iterator.remove();
        }
        System.out.println(employees);

        ArrayList<Employee> employees2 = new ArrayList<>();
        employees2.add(e);
        employees2.add(e1);
        employees2.add(e2);
        employees2.add(e3);
        employees2.add(e4);
        employees2.add(e5);
        employees2.add(e6);
        employees2.add(e7);
        employees2.add(e8);

        employees2.removeIf(emp -> emp.name.length() == 0);

        employees2.replaceAll(employee -> {
            if (employee.name.length() == 4)
                employee.name = "LOLOLO";
            return employee;
        });

        List<Employee> s = employees.stream()
                .filter(emp -> emp.getName().startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(s);
        System.out.println(employees2);

        Employee[] employeesArray = {e1, e2, e3};
        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println(employeesArray[i]);
        }

        for (Employee emp :
                employeesArray) {
            System.out.println(emp);
        }

        Arrays.stream(employeesArray).forEach(emp -> System.out.println(emp));
        employees.forEach(emp -> System.out.println(emp));

    }
}
