package md.tekwill.demo.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class Demo {
    public static void main(String[] args) {
        LocalDate from = LocalDate.of(1999, 12, 31).minusYears(100);

        LocalDate to = LocalDate.of(1999, 12, 31);
        int howManyFridays13 = DayChecker.countDayBetween(DayOfWeek.FRIDAY, 13, from, to);
        System.out.println(howManyFridays13);


        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDate.atTime(LocalTime.of(18, 00));
        LocalDateTime localDateTime2 = localTime.atDate(LocalDate.of(199, 1, 1));
        localDate.toEpochDay();

        Period period = Period.of(1, 2, 3);
        Period period1 = Period.ofDays(3);
        Period period2 = Period.parse("-P-5Y-7M1D");
        Period period3 = Period.parse("P5Y7M-1D");
        Period period4 = Period.parse("P5W");
        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period3.minus(period4));
        System.out.println(period3.minus(period4).plus(Period.ofDays(150)));

        System.out.println(Period.between(from, to));
        System.out.println(from);
        System.out.println(from.plus(Period.ofDays(2)));
        System.out.println(from.minusYears(2));

        LocalDate start = LocalDate.now();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDate end = LocalDate.now().minusYears(2).plusDays(15).minusMonths(7).plusWeeks(11);
        Period between = Period.between(start, end);
        System.out.println(between);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
        between = between.plusDays(150);
        between = between.plusYears(4);

        System.out.println(between.isZero());
        System.out.println(between.isNegative());

        System.out.println();
        System.out.println(end.format(DateTimeFormatter.ISO_DATE));
        System.out.println(end.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(startDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(end.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(end.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(end.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(end.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println();
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println();
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(startDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println();
        System.out.println(startDateTime.format(DateTimeFormatter.ofPattern("yyyy MM dd @ hh:mm")));
        System.out.println(startDateTime.format(DateTimeFormatter.ofPattern("y M d @ h:m")));
        System.out.println(startDateTime.format(DateTimeFormatter.ofPattern("dd @ hh:mm")));
        System.out.println(startDateTime.format(DateTimeFormatter.ofPattern("E dd @ hh:mm")));
        System.out.println();
        System.out.println(DateTimeFormatter.ISO_DATE.format(startDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).format(startDateTime));

        System.out.println();
        System.out.println(LocalDateTime.parse("2057 02 13 @ 07:12", DateTimeFormatter.ofPattern("yyyy MM dd @ HH:mm")));
        System.out.println(LocalDateTime.parse("2057 2 13 @ 00:12 AM", DateTimeFormatter.ofPattern("y M d @ h:m a")));


        System.out.println();
        String date = "2019-08-2";
        String[] split = date.split("-");
        String year = split[0];
        String month = split[1];

        System.out.println(LocalDate.parse(year + "-" + month + "-01"));

        System.out.println(LocalDate.parse("2018 03 02", DateTimeFormatter.ofPattern("yyyy MM dd")));
    }

}
