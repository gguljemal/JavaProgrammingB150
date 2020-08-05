package day09;

import java.util.Scanner;
public class EvenOddFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Odd or even?");
        int number = scan.nextInt();
        int remainder=number%2;

        if (remainder==0) {System.out.println("This is an even number");}
        else {System.out.println("This is an odd number");}
        System.out.println("End");


    }
}
