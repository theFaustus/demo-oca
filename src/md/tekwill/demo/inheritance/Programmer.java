package md.tekwill.demo.inheritance;

import java.util.Arrays;

class Programmer extends Employee {
    private String[] programmingLanguages;

    public Programmer(String name, String address, String... programmingLanguages) {
        super(name, address);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void writeCode(){
        System.out.println("Writing code!");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
