package day39;

public class Garage {

    public static void main(String[] args) {

       Car car1 = new Car();

       car1.make = "Toyota";
       car1.model = "4 Runner";
       car1.color = "white";
       car1.year = 2020;
       car1.goForward();
        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);

        Car car2 = new Car();
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        car2.year = 2017;
        car2.goForward();
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.color = " + car2.color);

        car2.year = 2020;
        System.out.println("car2 year = " + car2.year);

        //I want to change the color of Hyundai to the color of Toyota
        car2.color = car1.color;
    }
}
