package collections;

import EISClassW.Dog;
import EISClassW.Shepherd;

import java.util.*;

/**
 * Created by Alex on 01.03.2017.
 */
public class ListDemo {

    public static void main(String[] args) {

        List<Integer> integers;
        integers = new ArrayList<>();

        integers = Arrays.asList(1, 2, 3, 4);

          /*

        int --> Integer
        long --> Long
        char --> Character
        byte --> Byte
        short --> Short
        double --> Double
        float --> Float
        boolean --> Boolean

         */

        //autoboxing
        Integer intgr = new Integer(2);
        intgr = 3;

//        System.out.println(integers);

        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(2); //auto unboxing
        anotherList.add(3); //add element to list end
        anotherList.add(4);
        anotherList.add(18);
        anotherList.add(2, 42); //add element by index

        anotherList.addAll(Arrays.asList(5, 7, 9, 100500)); //add a collection of elements to the end of the list

//        System.out.println(anotherList);
//        System.out.println(anotherList.get(3));


        //remove element by index
        anotherList.remove(1);

        //remove element by value
        anotherList.remove((Integer) 9);

//        System.out.println(anotherList);
//        System.out.println(anotherList.subList(2, 5));


        //equals
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        List<String> filler = Arrays.asList(
                "one",
                "two",
                "three",
                "four",
                "five"
        );
        strings.addAll(filler);
        strings2.addAll(filler);

        System.out.println(strings);
        System.out.println(strings2);
        System.out.println(strings.equals(strings2));


        //NEVER EVER REMOVE ELEMENTS IN LOOPS
        //        for (String string : strings) {
        //            if (string.contains("o"))
        //                strings.remove(string);
        //        }

        //iterator usage example
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext())
            if(iterator.next().contains("o")) iterator.remove();

//        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Shepherd("one", 8, 'W'));
        dogs.add(new Shepherd("two", 24, 'W'));
        dogs.add(new Shepherd("three", 6, 'W'));
        dogs.add(new Shepherd("for", 29, 'W'));


        //comparator example
//        System.out.println(dogs);
        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                if (o1.getAge() < o2.getAge()) return -1;
                else if (o1.getAge() > o2.getAge()) return 1;
                else return 0;
            }
        };
        Collections.sort(dogs, dogComparator);
//        System.out.println(dogs);
    }
}
