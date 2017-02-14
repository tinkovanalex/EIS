package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Runner {

    public static void main(String[] args) {

        //Shepherd rex = new Shepherd();
        //Shepherd billy = new Shepherd("billy");
        Shepherd bella = new Shepherd("bella", 2, 'H');

        Mops mops = new Mops("Jack");

        //Dog dog = new Mops();
        //Dog dog2 = new Shepherd();
        // Mops dog3 = new Dog(); mistake


        //System.out.println(rex);
        //System.out.println(billy);
        //System.out.println(bella);

       // billy.move();
        //bella.voice();
        //mops.voice();
       // rex.catchBadGuy();
       // mops.scratchYourself();
        //mops.voice();

        //bella.eat();
        //bella.eat("dogfood");

        Automobile automobile = new Automobile();
        Dove dove = new Dove();

        whoAreYou(automobile);
        whoAreYou(bella);
        whoAreYou(dove);
        //mops.drink();

        Moveable rock = new Moveable() {
            public void move() {
                System.out.println("Rollin' from anther rock!");

            }
        };

        whoAreYou(rock);
        rock.move();

    }

    private  static void whoAreYou(Moveable object){
        System.out.println("I am " + object.getClass().getSimpleName());
    }
}
