package date;

import java.time.LocalDate;

/**
 * The class demonstrates working with dates
 */
public class DateSample {
    static LocalDate date = LocalDate.now();

    public static void getDayOfWeek() {
        System.out.println("Today is " + date.getDayOfWeek());
    }

    public static void getDateOfNextTuesday() {
        //value 2 in next line means the index of tuesday
        int delta = 2 - date.getDayOfWeek().getValue();
        if (delta > 0) {
            date = date.plusDays(delta);
        } else {
            date = date.plusDays(7 + delta);
        }
        System.out.printf("Next TUESDAY will be %d.%d.%d \n", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }
}
