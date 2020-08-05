package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner abc = new Scanner (System.in);

        System.out.println("What is your name? ");
        String name = abc.nextLine();
        System.out.println("Your name is: " +name);

        System.out.println("What is your age? ");
        //String age = abc.nextLine();
        int age= abc.nextInt();
        abc.nextLine();   //we capture without saving input
        System.out.println("Your age is: "+ age);

        System.out.println("What is your address? ");
        String address = abc.nextLine();
        System.out.println("Your address is: "+ address);


    }
}
