package day17;

import java.util.Scanner;

public class ReversePrintString {

    public static void main(String[] args) {

        //assuming you do not know the length of your name
        //write a program to print your name in reverse order

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
       String name= scan.nextLine();
       int x= name.length()-1;

       while(x>=0){

           System.out.print("index "+x+":");
           System.out.println(name.charAt(x));
           --x;

       }
    }
}
