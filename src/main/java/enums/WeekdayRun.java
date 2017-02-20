package enums;

/**
 * Created by Alex on 20.02.2017.
 */
public class WeekdayRun {
    public static void main(String[] args) {
        Days day = Days.SUNDAY;

        System.out.println(day.getWeekDay());
        System.out.println(day.americanWeekday());
        System.out.println(day.americanWeekdayShortNotation());
    }
}
