package day06;

import java.util.Scanner;

public class iScannerCapturingMultipleWord {

    public static void main(String[] args) {

       Scanner abc = new Scanner(System.in);

       System.out.println("What is your name? ");

        String name = abc.next();      // it will capture only 1 word if there is 2

        String lastName = abc.next();
        //String anotherWord= abc.next();
        int age = abc.nextInt();

        System.out.println("You have entered: "+ name);

        System.out.println("Your last name is: " + lastName);

        System.out.println("Your age is "+ age);

    }
}
