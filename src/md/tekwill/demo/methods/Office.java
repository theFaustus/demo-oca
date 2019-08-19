package md.tekwill.demo.methods;

class Office {
    public static void main(String[] args) {
        Manager m = new Manager();
        Employee employee = m.hireEmployee();
        boolean hired = employee.isHired();
        employee.setHired(true);
        System.out.println(hired);
        m.fireEmployee(employee);
        System.out.println(employee.isHired());

    }
}
