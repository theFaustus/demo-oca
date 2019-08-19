package md.tekwill.demo.methods;

class Manager {
    public Employee hireEmployee(){
        Employee employee = new Employee();
        employee.setHired(true);
        return employee;
    }

    public void fireEmployee(Employee e){
        e.setHired(false);
    }
}
