package md.tekwill.demo.scopes;

class Demo {
    public static void main(String[] args) {
        Employee e = new Employee(); //local variable
        e.setName("Mike");
        Employee e2 = new Employee(); //local variable
        e2.setName("Bob"); //instance method call - setter method call
        //static method
        foo();
        //instance method call - getter method call
        System.out.println(e.getName() + " and " + e2.getName() + " work at " + Employee.company);
        e.company = "Google";
        System.out.println("After a year...");
        System.out.println(e.getName() + " and " + e2.getName() + " work at " + Employee.company);
        foo();
        Employee.party(); //static method call

    }

    public static void foo(){
        Employee e = new Employee(); //local variable
        e.setName("Hector");
        System.out.println(e.getName() + " works alone at " + e.company);
    }
}
