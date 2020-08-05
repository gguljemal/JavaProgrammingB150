package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    // String make is not inherited because
    // it has default access modifier which accept only within 1 package
    // private int year is not inherited!

     int mileage;

    public static void main(String[] args) {

     Car c1 = new Car ();
     c1.mileage = 39637;
        System.out.println("c1.mileage = " + c1.mileage);
     c1.setYear(2016);
        System.out.println( "c1.getYear() = " + c1.getYear() );


}
}