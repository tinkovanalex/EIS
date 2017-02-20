package enums;

import EISClassW.Dog;
import EISClassW.Shepherd;

/**
 * Created by Alex on 20.02.2017.
 */
public class PolicyRunner {
    public static void main(String[] args) {
       // PolicyUtil.issuePolicy(Products.PCG_AUTO);
        //PolicyUtil.issuePolicy(Products.PCG_HOME);

        /*
        < >, <= =>
        ==
        !=
        instanceof
        */

//        System.out.println(5 <=9 );
//        System.out.println(5>3);
//        System.out.println(5 < 'P');
//        System.out.println(6 == 6);
//        System.out.println(7 != 7);
//        System.out.println(new Shepherd() instanceof Dog);

        Shepherd shepherdOne = new Shepherd();
        Shepherd shepherdTwo = new Shepherd();

//        System.out.println(shepherdOne);
//        System.out.println(shepherdTwo);
//
//        System.out.println(shepherdOne == shepherdTwo);
//        System.out.println(shepherdOne.equals(shepherdTwo));
//
//        shepherdTwo.setAge(5);
//        System.out.println(shepherdOne.equals(shepherdTwo));
//
//        if((shepherdOne.getSex() == 'M' && shepherdOne.getAge() < 10)
//                || (shepherdOne.getSex() == 'F' && shepherdOne.getAge() < 9)){
//            System.out.println("it's a boy");
//        } else if (shepherdOne.getSex() == 'F'){
//            System.out.println("it's a girl");
//        }
//        else {
//            System.out.println("what the hell is this?!");
//        }
        issuePolicy(Products.PCG_AUTO);
        issuePolicy(Products.PCG_HOME);
    }

    private static void issuePolicy(Products product){
        switch (product){
            case PCG_AUTO:
                System.out.println("Done issuing PCG Auto");
                break;
            case PCG_FLOOD:
                System.out.println("Done issuing PCG Flood");
                break;
            case PCG_HOME:
                default:
                    System.out.println("Dunno whatthat is: " + product.getProductName());
        }
    }

}
