package HW5_Enums;

import java.util.Scanner;

/**
 * Created by Alex on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String name = monthFromKeyboard();
        if(name.equals("JANUARY")
                | name.equals("FEBRUARY")| name.equals("MARCH")| name.equals("APRIL")
                | name.equals("MAY")| name.equals("JUNE")| name.equals("JULY")| name.equals("AUGUST")
                | name.equals("SEPTEMBER")| name.equals("OKTOBER")| name.equals("NOVEMBER")| name.equals("DECEMBER")){
            mothNamePrint(Months.valueOf(name));
        }else System.out.println("Enter valid month name");
    }

    public static String monthFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the month name!");
        String name = "";
        if(scanner.hasNextLine()){
            name = scanner.nextLine();
            name = name.toUpperCase();
        }
        return name;

    }

    public static void mothNamePrint(Months months){
        switch (months){
            case JANUARY:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-st month of the year and it is " + months.getSeason());
                break;
            case FEBRUARY:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-nd month of the year and it is " + months.getSeason());
                break;
            case MARCH:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-rd month of the year and it is " + months.getSeason());
                break;
            case APRIL:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case MAY:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case JUNE:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case JULY:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case AUGUST:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case SEPTEMBER:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case OCT0BER:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case NOVEMBER:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
            case DECEMBER:
                System.out.println(months.name() + " is the " + months.getMonthNumber() + "-th month of the year and it is " + months.getSeason());
                break;
        }
    }
}

