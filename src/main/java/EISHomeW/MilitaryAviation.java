package EISHomeW;

/**
 * Created by Alex on 12.02.2017.
 */
public class MilitaryAviation extends Aircraft{


    public MilitaryAviation(String name, String type, int age, int numberOfPassengers){
        super(name, type, age, numberOfPassengers);
    }


    public MilitaryAviation(String name, String type, int age){
        super(name, type, age);
    }


    public MilitaryAviation(){
        super();
    }

    public void shoot(){
        System.out.println("Tra-ta-ta-ta-ta-ta-ta-ta");
    }
}
