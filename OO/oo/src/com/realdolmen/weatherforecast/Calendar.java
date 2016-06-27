import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

/**
 * Prints out the days of a month in a familiar way.
 */
public class Calendar {
    public static void main(String[] args) {
        int year = 2016;
        for(Month m : Month.values()) {
            System.out.println(m + " " + year);
            printMonth(YearMonth.of(year, m));
            System.out.println();
        }

    }

    private static void printMonth(YearMonth month) {
        LocalDate date = LocalDate.of(month.getYear(), month.getMonth(), 1);
        printHeader();
        leadIn(date.getDayOfWeek().getValue() - 1);
        printDays(date);
    }

    private static void printDays(LocalDate date) {
        Month thisMonth = date.getMonth();
        while(date.getMonth() == thisMonth) {
            System.out.print(date.getDayOfMonth() + "\t");
            if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
            date = date.plus(1, ChronoUnit.DAYS);
        }
        System.out.println();
    }

    private static void printHeader() {
        String[] labels = {"Ma", "Di", "Wo", "Do", "Vr", "Za", "Zo"};
        for(DayOfWeek dow : DayOfWeek.values()) {
            System.out.print(labels[dow.getValue() - 1] + "\t");
        }
        System.out.println();
    }

    private static void leadIn(int skipCount) {
        for(int i=0; i < skipCount; i++) {
            System.out.print('\t');
        }
    }
}
