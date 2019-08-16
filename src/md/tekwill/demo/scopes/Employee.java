package md.tekwill.demo.scopes;

//Encapsulated
public class Employee {
    private String name; //private instance variable
    static String company = "Tekwill"; //default class variable - default static method

    //class method - static method
    public static void party(){
        System.out.println("Everybody parties at " + company);
    }

    //setter - modifier - instance method
    public void setName(String n){//method parameter
        name = n;
    }

    //getter - accessor - instance method
    public String getName(){//method parameter
        return name;
    }
}
