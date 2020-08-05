package day39;

public class Car {

    //year, model, make, color

    int year;
    String model;
    String make;
    String color;

    // or in one shot
    // String model, make, color

    //instance methods are tied to the object
    //it does not have static keyword
    //we need an object when we call them

    public void goForward(){
        System.out.println(make + " Going forward");
    }

    //Create a method to print how old is this car

   public void printCarAge(){
       System.out.println("cars age = " + (2020-year) );
   }

   public void changeColor (String newColor){

        color = newColor;
   }
}
