package generics;

import EISClassW.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 06.03.2017.
 */
public class BadCollection {
    public static void main(String[] args) {
        List list = new ArrayList();

        //list.add(2);
        list.add("aaaa");
       // list.add(new Dog());

        for(Object k : list){
            System.out.println(((String) k).length());
        }

    }

}
