package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner abc= new Scanner(System.in);

        System.out.println("What is your name? ");

        //nextLine method os Scanner is used to capture whole line

        String name = abc.nextLine();

        System.out.println("You have entered "+ name);

        //task 7

        /* use nextLine to ask your bio
        *whats your name, which city you live in, including state, Tyson,VA
        * what is your street address
         */

        System.out.println("What is your name? ");

        String firstName = abc.nextLine();

        System.out.println("My name is "+ firstName);

        System.out.println("Where do you live? ");

        String address = abc.nextLine();

        System.out.println("My address is "+ address);

    }
}
