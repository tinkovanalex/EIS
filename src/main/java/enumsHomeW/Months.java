package enumsHomeW;

import java.util.Scanner;

/**
 * Created by Alex on 28.02.2017.
 */
    public enum Months {

    JANUARY (1, "winter"),
    FEBRUARY (2, "winter"),
    MARCH (3, "spring"),
    APRIL (4, "spring"),
    MAY (5, "spring"),
    JUNE (6, "summer"),
    JULY (7, "summer"),
    AUGUST (8, "summer"),
    SEPTEMBER (9, "autumn"),
    OCT0BER (10, "autumn"),
    NOVEMBER (11, "autumn"),
    DECEMBER(12, "winter");

    int monthNumber;
    String season;

    Months(int monthNumber, String season){
        this.monthNumber = monthNumber;
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public int getMonthNumber() {
        return monthNumber;
        }
    }

