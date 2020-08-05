package day39;

public class Garage2 {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Toyota";
        car1.model = "4 Runner";
        car1.color = "white";
        car1.year = 2020;
        car1.goForward();
        car1.printCarAge();
        car1.changeColor("blue");
        System.out.println("car1.color = " + car1.color);

        Car car2 = new Car();
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        car2.year = 2017;
        car2.goForward();
        car2.printCarAge();
    }
}
