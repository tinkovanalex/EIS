package EISHomeW;

/**
 * Created by Alex on 12.02.2017.
 */
public class CivilAviation extends Aircraft {


    public CivilAviation(String name, String type, int age, int numberOfPassengers){
        super(name, type, age, numberOfPassengers);
    }


    public CivilAviation(String name, String type, int age){
        super(name, type, age);
    }


    public CivilAviation(){
        super();
    }


    public void causeFlightAttendant(){
        System.out.println("Flight Attendant came");
    }


    public void turnOnAutopilot(String name) {
        System.out.println("Autopilot is turned on" + name);
    }

    public void turnOffAutopilot() {
        System.out.println("Autopilot is turned off");
    }

    public void refuil() {
        System.out.println("The plane is refuil");
    }

}
