package in.datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MonthsBetweenDates {
    public static void main(String[] args) {
        // Define two date objects
        LocalDate date1 = LocalDate.of(2022, Month.AUGUST, 8);
        LocalDate date2 = LocalDate.of(2023, Month.JUNE, 6);

        // Calculate the period between the two dates
        Period period = Period.between(date1, date2);

        // Extract the number of months from the period
        int monthsBetween = period.getYears() * 12 + period.getMonths();

        System.out.println("Months between the two dates: " + monthsBetween
        +" year value" + period.getYears() + " Months" + period.getMonths()
        );
        System.out.println(48+14+10+4);
    }
}
//Infometry Inc : 48
//Citiustech : 14
//Mindtree : 10
//Johnson controls: 4