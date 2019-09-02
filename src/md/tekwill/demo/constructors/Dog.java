package md.tekwill.demo.constructors;

class Dog {
    public static final String GENUS = "CANINE";

    private String name = "unknown";
    private int ageInYears;
    private String breed;
    private String genre;

    {
        System.out.println(name + " dog is being born!");
    }

    public Dog() {
        this("Mike", 4, "Magic", "Male");
    }
    public Dog(String name, int ageInYears) {
        this(name, ageInYears, "Magic", "Male");
    }
    public Dog(String name, int ageInYears, String breed, String genre) {
        this.name = name;
        if (ageInYears < 0 || ageInYears > 33)
            this.ageInYears = 1;
        else
            this.ageInYears = ageInYears;
        this.breed = breed;
        this.genre = genre;
    }

    public void bark() { System.out.println(name + " > Woof, woof!"); }
    public void walk() { System.out.println(name + " > Walking..."); }
    public void executeCommand(String command) {
        System.out.println(name + " > Executing " + command.toUpperCase());
    }
    public void executeCommand(String command, int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println(name + " > Executing " + command.toUpperCase() + " #" + i);
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAgeInYears() {
        return ageInYears;
    }
    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ageInYears=" + ageInYears +
                ", breed='" + breed + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
