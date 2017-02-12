package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Dog {
    String name;
    int age;
    char sex;


    public Dog(){
        this("Rex", 2, 'M');
    }


    public Dog(String name){
        this(name, 3, 'M');
    }


    public Dog(String name, int age){
        this(name, age, 'M');
    }


    public Dog(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void move(){
        System.out.println("Running");
    }

    public void voice(){
        System.out.println("Woof");
    }

    public String toString() {
        return String.format("Hi! I'm %s, I'm %d YO and I'm a good %s",
                name, age, sex ==  'M' ? "boy" : "girl");
    }

}