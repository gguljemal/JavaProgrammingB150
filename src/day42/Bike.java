package day42;

public class Bike {

    int gear;
    int speed;

    //constructor is a block of code that has same NAME as class name
    //and has no return type, if it does not meet above requirement it is not constructor
    // the only time you can call this is: when object is being created

    public Bike () {
        System.out.println( "message from constructor" );
        this.gear = 1;
    }
    public Bike (int gear ){
        this.gear = gear;
    }
    public Bike (int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public Bike ( String str ){
        System.out.println("Accept String!!!");
    }
}
