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

//    public boolean equals (Object anotherDog){
//        if((Dog)anotherDog == null) return false;
//        if(((Dog)anotherDog).getAge() == this.getAge()
//            && ((Dog)anotherDog).getSex() == this.getSex()
//                && ((Dog)anotherDog).getName().equals(this.getName())){
//            return true;
//        }
//        return false;
//    }
//
//    public int hashCode(){
//        return age * 42 * sex * 31 - name.length() * 3;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (sex != dog.sex) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (int) sex;
        return result;
    }
}