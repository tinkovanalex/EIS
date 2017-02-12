package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Mops extends Dog{

    public Mops(){
        super();
    }

    public Mops(String name){
        super(name);
    }

    public Mops(String name, int age, char sex){
        super(name, age, sex);
    }

    public void scratchYourself(){
        System.out.println("IIIIooou");
    }
}
