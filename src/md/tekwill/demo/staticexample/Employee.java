package md.tekwill.demo.staticexample;

public class Employee {
    public String name; //instance variable
    public static int bankVault = 5; //class variable

    public Employee(String name){
        this.name = name;
    }

    public void foo(){
        System.out.println(name);
        System.out.println(bankVault);
    }

    public static void bar(){
        //System.out.println(name); not available
        System.out.println(bankVault);
    }

}




