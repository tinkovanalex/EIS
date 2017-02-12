package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Runner {
    public static void main(String[] args) {

        Shepherd rex = new Shepherd();
        Shepherd billy = new Shepherd("billy");
        Shepherd bella = new Shepherd("bella", 2, 'H');

        Mops mops = new Mops("Jack");

        System.out.println(rex);
        System.out.println(billy);
        System.out.println(bella);

        billy.move();
        bella.voice();
        rex.catchBadGuy();
        mops.scratchYourself();
        mops.voice();

    }
}
