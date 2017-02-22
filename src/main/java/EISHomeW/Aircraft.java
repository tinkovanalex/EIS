package EISHomeW;

/**
 * Created by Alex on 09.02.2017.
 */
abstract class Aircraft implements Autopilot, RefuelAircraft{

        private String name;
        private String type; //PassengerCarrying, CargoCarrying, // Shturmovik
        private int age;
        private int numberOfPassengers;


        public Aircraft(String name, String type, int age, int numberOfPassengers){
            this.name = name;
            this.type = type;
            this.age = age;
            this.numberOfPassengers = numberOfPassengers;
        }


        public Aircraft(String name, String type, int age){
            this(name, type, age, 0);
        }

        public Aircraft (){
            this("Mi-8", "Helicopter", 1, 8);
        }


        public void takeOff(){
            System.out.println("The aircraft has taken off");
        }


        public void extendTheLandingGear(){
            System.out.println("The landing gear extanded");
        }


        public void land(){
            System.out.println("The aircraft has landed");
        }


        public String toString(){
             return String.format("Over-Over! It is %s, %s",
                    name, type );
        }



    }
