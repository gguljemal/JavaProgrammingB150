package day40;

public class Car {


        int year;
        String model;
        String make;
        String color;

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.year = 2020;
        car1.printCarAge();
    }
    public void printCarAge(){
        System.out.println("cars age = " + (2020-year) );
    }

    }

