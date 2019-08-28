package md.tekwill.demo.constructors;

class Cat {
    private int age;
    private String name;
    private String breed;
    private String color;

    //initializer block 1
    {
        System.out.println("A new cat is born...");
    }

    Cat() {
//        this.age = 999;
//        this.name = "Ceshire";
//        this.breed = "Magic";
//        this.color = "Mixed Gray/Blue";
        this(99, "Chesire", "Mixed Gray/Blue", "Magic");
    }

    Cat(int age, String name, String color) {
//        if (age < 0)
//            this.age = 1;
//        else
//            this.age = age;
//        this.name = name;
//        this.color = color;
//        this.breed = "Magic";
        this(age, name, color, "Magic");
    }

    Cat(int age, String name, String color, String breed) {
        if (age < 0)
            this.age = 1;
        else
            this.age = age;
        if (name.trim().isEmpty())
            this.name = "Ceshire";
        else
            this.name = name;
        this.color = color;
        this.breed = breed;
    }

    //initializer block 2
    {
        System.out.println("Still coming alive...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + breed + " " + color;
    }
}
