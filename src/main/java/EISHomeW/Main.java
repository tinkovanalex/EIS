package EISHomeW;

/**
 * Created by Alex on 12.02.2017.
 */
public class Main {
    public static void main(String[] args) {


//        CivilAviation an225 = new CivilAviation("An-225", "Cargo Airplane", 29);
//        CivilAviation an24 = new CivilAviation("An-24", "Passenger Airplane", 55, 52);

//        MilitaryAviation su25 = new MilitaryAviation("Su-25", "Shturmovik", 36);
//        MilitaryAviation su27 = new MilitaryAviation("Su-27", "Multirole fighter", 32);
//        MilitaryAviation mi8 = new MilitaryAviation();

//        System.out.println(an225);
//        an225.causeFlightAttendant();
//        an225.extendTheLandingGear();
//        an225.land();
//        System.out.println(" ");
//
//        //System.out.println(an24);
//        //System.out.println(su25);
//
//        System.out.println(su27);
//        su27.takeOff();
//        su27.shoot();
//        System.out.println(" ");
//
//        System.out.println(mi8);
//        mi8.shoot();
//

        CivilAviation an225 = new CivilAviation("Mriya", "Cargo Airplane", 29);
        MilitaryAviation su27 = new MilitaryAviation("Su-27", "Multirole fighter", 32);
        AgriculturalAviation an2 = new AgriculturalAviation("An-2", "Agricultural Airplane", 70);
        CargoCarrying an124 = new CargoCarrying("Ruslan", "Cargo Airplane", 35);
        PassengerCarrying an168 = new PassengerCarrying("An-168", "Passengers Plane", 16, 38);

        an168.refuil();
        an168.causeFlightAttendant();
        an168.extendTheLandingGear();
        an168.land();
        an168.turnOffAutopilot();
        an168.turnOnAutopilot();
        an168.takeOff();

        test(an168);

    }

    private static void test(Autopilot object){
        System.out.println("I am plane for" + object.getClass().getSimpleName());
    }
}
