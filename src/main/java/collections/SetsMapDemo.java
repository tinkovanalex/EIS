package collections;

import EISClassW.Dog;

import java.util.*;

/**
 * Created by Alex on 01.03.2017.
 */
public class SetsMapDemo {
//    public static void main(String[] args) {
//        Set<String> string = new HashSet<>();
//        string.add("dfs");
//        string.add("dfs");
//        string.add("dfsdsf");
//        System.out.println(string);
//
//        Set<String> tree = new TreeSet<>();
//        tree.add("ssssssss");
//        tree.add("ssssssss");
//        tree.add("ssssssss");
//        tree.add("tttttttt");
//        tree.add("gggggggg");
//        tree.add("zzzzzzzz");
//        System.out.println(tree);
//
//        Set<Dog> dogset = new TreeSet<>();
//        Dog rex = new Dog ("Rax", 3, 'M');
//        Dog joe = new Dog ("Joe", 2, 'M');
//        Dog jac = new Dog ("Jac", 4, 'M');
//
//        dogset.addAll(Arrays.asList(rex, joe, jac));
//
//        System.out.println(dogset);
//    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("Rex", "Podle");
        map.put("Vasya", "Pug");
        map.put("SOm", "Just a dog");
        map.put("null", "dsds");
        System.out.println(map);

        map.put("Rex", "Not a dog");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey().length());
        }


    }
}
