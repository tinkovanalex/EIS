package enumsHomeW;

import java.util.Scanner;

/**
 * Created by Alex on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
       mothNamePrint(Months.valueOf(monthFromKeyboard()));

    }

    public static String monthFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number !");
        String name = "Please, enter month number";
        if(scanner.hasNextLine()){
            name = scanner.nextLine();
        }
        return name;

    }


    public static void mothNamePrint(Months monthes){
        switch (monthes){
            case JANUARY:
            case FEBRUARY:
                System.out.println("1111111111" +  monthes.getMonthNumber());
                break;
            case APRIL:
                System.out.println("22222222222222");
                break;
        }
    }

}

