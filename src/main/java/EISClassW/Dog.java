package EISClassW;

/**
 * Created by Alex on 08.02.2017.
 */
public class Dog extends Animal implements Moveable{
    private String name;
    private int age;
    private char sex;


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
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "EIS Kennel " + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("I ate a bone");
    }


    public void eat(String food){
        System.out.println("I ate " + food + "!");
    }

    public void voice(){
        System.out.println("Woof");
    }

    @Override // переопределение
    public String toString() {
        return String.format("Hi! I'm %s, I'm %d YO and I'm a good %s",
                name, age, sex ==  'M' ? "boy" : "girl");
    }

    protected void drink() {
        System.out.println("I Drank");
    }

    public void move() {
        System.out.println("I run");
    }
}