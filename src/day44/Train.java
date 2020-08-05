package day44;

//INHERITING  ===>>
// FIELDS & METHODS that visible in sub class are inherted
//constructors are not inherited
public class Train extends Vehicle {

//    String make;
//    int year;
//
//    public void start(){
//        System.out.println( "starting " + make );
//    }
//
//    public void goForward (){
//        System.out.println( make + " is going forward");
//    }

    int wagons;

    public void makeChoChoSound(){
        System.out.println("Chooo Chooo");
    }

    public static void main(String[] args) {

        Train t1 = new Train ();

        t1.makeChoChoSound();
        t1.make = "Thomas";
      //  t1.year = 1999; because it is private we use setter and getter
        t1.setYear(1999);
        System.out.println( t1.getYear() );
        t1.start();
        t1.goForward();
    }
}
