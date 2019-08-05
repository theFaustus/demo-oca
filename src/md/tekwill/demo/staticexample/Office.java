package md.tekwill.demo.staticexample;

class Office {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob");
        Employee e4 = new Employee("Peter");
        Employee e5 = new Employee("Mark");

        System.out.println("Initial bankVault value = " + Employee.bankVault);
        e1.bankVault = 4;
        System.out.println(e1.name + " changed the vault value to = " + e1.bankVault);
        System.out.println(e1.name + " saw the vault value = " + e1.bankVault);
        System.out.println(e2.name + " saw the vault value = " + e2.bankVault);
        System.out.println(e3.name + " saw the vault value = " + e3.bankVault);
        System.out.println(e4.name + " saw the vault value = " + e4.bankVault);
        System.out.println(e5.name + " saw the vault value = " + e5.bankVault);

        e2.bankVault = 8;
        System.out.println(e2.name + " changed the vault value to = " + e1.bankVault);
        System.out.println(e1.name + " saw the vault value = " + e1.bankVault);
        System.out.println(e2.name + " saw the vault value = " + e2.bankVault);
        System.out.println(e3.name + " saw the vault value = " + e3.bankVault);
        System.out.println(e4.name + " saw the vault value = " + e4.bankVault);
        System.out.println(e5.name + " saw the vault value = " + e5.bankVault);

        Employee.bankVault = 5;
        System.out.println("BankVault reset the vault value to = " + Employee.bankVault);
        System.out.println(e1.name + " saw the vault value = " + e1.bankVault);
        System.out.println(e2.name + " saw the vault value = " + e2.bankVault);
        System.out.println(e3.name + " saw the vault value = " + e3.bankVault);
        System.out.println(e4.name + " saw the vault value = " + e4.bankVault);
        System.out.println(e5.name + " saw the vault value = " + e5.bankVault);

        Employee.bar();
        e1.foo();
        e1.bar();
    }
}
