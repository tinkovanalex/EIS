package EISHomeW;

/**
 * Created by Alex on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {


        CivilAviation an225 = new CivilAviation("An-225", "Cargo Airplane", 29);
        CivilAviation an24 = new CivilAviation("An-24", "Passenger Airplane", 55, 52);

        MilitaryAviation su25 = new MilitaryAviation("Su-25", "Shturmovik", 36);
        MilitaryAviation su27 = new MilitaryAviation("Su-27", "Multirole fighter", 32);
        MilitaryAviation mi8 = new MilitaryAviation();

        System.out.println(an225);
        an225.causeFlightAttendant();
        an225.extendTheLandingGear();
        an225.land();
        System.out.println(" ");

        //System.out.println(an24);
        //System.out.println(su25);

        System.out.println(su27);
        su27.takeOff();
        su27.shoot();
        System.out.println(" ");

        System.out.println(mi8);
        mi8.shoot();


    }
}
