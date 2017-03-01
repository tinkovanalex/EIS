package enumsHomeW;

import java.util.Scanner;

/**
 * Created by Alex on 28.02.2017.
 */
    public enum Months {

    JANUARY (1),
    FEBRUARY (2),
    APRIL(4);

    int monthNumber;

    Months(int monthNumber){
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            this.monthNumber = scanner.nextInt();
        }
        return monthNumber;
    }

}

