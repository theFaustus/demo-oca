package md.tekwill.demo.inheritance.interfaces.printableinterface;

class Manager implements Printable, Printable2{
    private String employeeNumber;
    private String name;

    public Manager(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("************************************");
        System.out.println("Manager name > " + name);
        System.out.println("Manager empNumber > " + employeeNumber);
        System.out.println("************************************");
    }

    @Override
    public int print(int a) {
        return 0;
    }
}
