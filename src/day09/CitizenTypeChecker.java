package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        /*
        *Create a class called CitizenTypeChecker with main method
        * create a variable called citizenType as String
        * and create a variable with age
        * if age is more than 65, assign value of citizenType
        * if not, assign value of citizenType to Not-Senior
        * Eventually print out (the citizen age is <number>, he is <senior>)
         */

        String citizenType;
        int age=60;

        if (age>65) { citizenType="Senior";}
        else {citizenType="Not senior";}

        System.out.println("The citizen age is "+age+", and he is a "+citizenType);

    }
}
