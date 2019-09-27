package md.tekwill.demo.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class DayChecker {
    public static int countDayBetween(DayOfWeek day, int dayOfMonth, LocalDate from, LocalDate to) {
        int howManyMatchesOfDayAndDayOfMonth = 0;
        while (!to.isEqual(from)) {
            if (to.getDayOfWeek() == day
                    && to.getDayOfMonth() == dayOfMonth) {
                howManyMatchesOfDayAndDayOfMonth++;
                System.out.println(to.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
            }
            to = to.minusDays(1);
        }

        return howManyMatchesOfDayAndDayOfMonth;
    }
}
