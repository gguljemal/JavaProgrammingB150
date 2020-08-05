package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {

        //+ - *  %

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println("----modulus.remainder----");

        System.out.println(5%2);
        System.out.println(99%10);
        System.out.println(100%10);

        /* declare a variable called minutes, data type int
        *ask user to enter minutes as whole number
        * print the result in x hour y minute format
        * for example 135 minutes, 2 hours 15 minutes
         */
        Scanner abc = new Scanner (System.in);

        System.out.println("How many hours left? ");
        int minutes = abc.nextInt();
        int hours = abc.nextInt();
        System.out.println( "x= "+hours+" hours and y= "+minutes+" minutes " );

        int minuteNow=135;
        int hourNow=135/60; //60*2+15
        int remain= 135%60; //15i remain

        System.out.println("The minutes "+ minuteNow+" is "+hourNow+"");
    }
}
