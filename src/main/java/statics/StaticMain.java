package statics;

import EISClassW.Dog;
import EISClassW.Shepherd;

/**
 * Created by Alex on 15.02.2017.
 */
public class StaticMain {

    public static final String STRING = "Final String";
    public static final Shepherd shepherd = new Shepherd();

    public static void main(String[] args) {
        System.out.println(shepherd);
        shepherd.setName("Vasja");
        System.out.println(shepherd);
    }

//    public static void main(String[] args) {
//
//
//
//        int i;
//        long l;
//
//
//        int factorial = 1;
//        for(int j = 1; j<25; j++){
//            factorial = factorial * j;
//            System.out.println("Step " + j + ": " + factorial);
//        }
//
//
//        System.out.println(Watch.getTime());
//        System.out.println(Watch.getDate());
//        System.out.println(Watch.getDateTime());
//        System.out.println(Watch.watchName);
//
//
//        float f;
//        double d;
//
//        d = 1.2f;
//
//        char c = 'C';
//
//        System.out.println(c);
//        System.out.println((int) c);
//        System.out.println((char) 80);
//
//
//        boolean b = true;
//
//        String str = "String";
//       // str.substring(2);
//        str = str.substring(2);
//
//        System.out.println(str);
//
//        StringBuilder builder = new StringBuilder();
//        builder.append("First").append("\n")
//                .append("second").append("\n");
//        System.out.println(builder.toString());
//
//        Watch cllock = new Watch();
//        String str2 = new String("sadfasdf"); // dont use it
//
//        Dog dog = new Dog();
//        ((Shepherd)dog).catchBadGuy();
//        String dogString = dog.toString();
//    }


}
