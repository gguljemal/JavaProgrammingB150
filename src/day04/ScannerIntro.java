package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

    //I want to save users input after asking some questions and
    // I want to save this input so I can do something with it

    // step 1: use Scanner class to crate scanner object that have this functionality

        Scanner scan = new Scanner (System.in);

        //ask user to enter name

        System.out.println ("Enter you first name please: ");

        //capture the answer the users write

        String firstName = scan.next();

        System.out.println ("Your name is " + firstName);

        System.out.println ("What is your age?");

        int age = scan.nextInt();

        System.out.println ( "Your age is: " + age);

    }

}
