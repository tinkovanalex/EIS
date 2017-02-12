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
}
