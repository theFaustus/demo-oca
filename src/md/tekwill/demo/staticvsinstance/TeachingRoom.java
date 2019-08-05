package md.tekwill.demo.staticvsinstance;

class TeachingRoom {
    // initialized with instance and accessible just with instance
    public String student;                                   //instance variable/attribute/instance field
    // initialized first and accessible without instance
    public static String chair = "Chair 1 in front of class"; // static/class variable


    public static void main(String[] args) {
        DaysOfWeekBad daysOfWeekBad = new DaysOfWeekBad();
        System.out.println(daysOfWeekBad.MONDAY);

        System.out.println(DaysOfWeekGood.FRIDAY);

    }


}
