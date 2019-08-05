package md.tekwill.demo.staticvsinstance;

public class DaysOfWeekBad {
    public String MONDAY = "MONDAY";
    public String TUESDAY = "TUESDAY";
    public String WEDNESDAY = "WEDNESDAY";
    public String THURSDAY = "THURSDAY";
    public String FRIDAY = "FRIDAY";
    public String WEEKEND = "WEEKEND";

    public String getDayOfWeek(){
        DaysOfWeekBad b = new DaysOfWeekBad();

        return b.FRIDAY;
    }
}
