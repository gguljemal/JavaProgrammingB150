package day42;

public class BikeAction {

    public static void main(String[] args) {

    Bike b1 = new Bike();
    Bike b2 = new Bike();

    // i do not want empty gear when object is created
    // i want to the bike come with gear set to 1
        System.out.println("b2.gear = " + b2.gear);
        System.out.println("b1.gear = " + b1.gear);

     // I want to be able to set the default gear to
     // any number I specify when object is being created
     Bike b3 = new Bike(4);
        System.out.println("b3.gear = " + b3.gear);

        //I want a Bike object with both
        //speed and gear set to the value I specify
}
}
