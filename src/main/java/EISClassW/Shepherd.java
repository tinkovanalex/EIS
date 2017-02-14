package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Shepherd extends Dog{

    public Shepherd(){
        super();
    }

    public Shepherd(String name){
        super(name);
    }

    public Shepherd(String name, int age, char sex){
        super(name, age, sex);
    }


    public void catchBadGuy(){
        System.out.println("Gotcha");
    }

    @Override
    public void voice(){
        System.out.println("Bark");
    }
}
