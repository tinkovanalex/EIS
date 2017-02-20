package enums;

/**
 * Created by Alex on 20.02.2017.
 */
public enum Days {

    MONDAY (1),
    TUESDAY (2),
    WEDNASDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6),
    SUNDAY (7);

    int weekDay;

    Days (int weekDay){
        this.weekDay = weekDay;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public int americanWeekday(){
        if(this.weekDay == 7) return 1;
        else return weekDay ++;
    }

    public int americanWeekdayShortNotation(){
        return this.weekDay == 7 ? 1 : weekDay++;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }
}
