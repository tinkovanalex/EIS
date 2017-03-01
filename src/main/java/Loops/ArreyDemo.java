package Loops;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Alex on 22.02.2017.
 */
public class ArreyDemo {

    public static void main(String[] args) throws InterruptedException {


        String[] newArray;

        newArray = new String[5];

        String[] anotherArray = new String[]{"one", "two", "three", "four"};

        String[] [] yetAnnotheArray = new String[5] [6];

        String[] [] [] yetYetAnnotheArray = new String[1] [2] [3];

        String[] [] jaggedArray = new String[] []{
                {"one", "two"},
                {"one", "two", "three"},
                {"one"}
        };

        Boolean bt = Arrays.equals(anotherArray, yetAnnotheArray);

//        Arrays.fill(anotherArray, 0, yetAnnotheArray.length, "0");
//        System.out.println(Arrays.toString(yetAnnotheArray));

        for(int y = 0; y < anotherArray.length; y++ ){
            anotherArray[y] = " element #" + y;
        }

      //  System.out.println(Arrays.toString(anotherArray));

        for(String s: anotherArray){
        //    System.out.println(s);
        }

        int counter = 0;
        while (counter < 10 ){
            counter++;
          //  System.out.println(counter);
        }

        counter = 0;
        do {
            counter++;
            //System.out.println(counter);
        }while (counter < 10);


        //-------------------------------------------------------------------

        counter = 0;
        while (true){
            counter++;
         //   System.out.println("Attempt: " + counter);
            Thread.sleep(500);
            if(counter == 10) break;
        }

        int trues = 0;
        int falses = 0;
        for (int i =0; i < 15; i++ ){
            boolean boo = new Random().nextBoolean();
            if(boo) trues++;
            else falses++;
//            System.out.println("\nboo :" + boo);
//            if(boo) continue;
//            System.out.println("I wod not have been be printed if boo was true");
        }

    }
}
