package statics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Alex on 15.02.2017.
 */
public class Watch {

    private static Calendar calendar;

    public static String watchName = "Omega";

    static {
        System.out.println("Calling static constractor..");
        calendar = Calendar.getInstance();
        System.out.println("Constractor finished");
    }


    public static String getTime(){
        return formateDate("HH:mm:ss");

    }


    public static String getDate(){
        return formateDate("dd MM yyyy");

    }


    public static String getDateTime(){
        return formateDate("HH:mm:ss | dd MMM YYYY");

    }


    private static  String formateDate(String pattern){
        return new SimpleDateFormat(pattern).format(calendar.getTime());
    }

}
