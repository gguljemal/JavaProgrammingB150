package day21;

import java.util.Scanner;

public class DecidingWhenToStop {

    public static void main(String[] args) {

     Scanner scan= new Scanner(System.in);

     String name=scan.nextLine();

     int lastIndex=name.length()-1;

     int n=2;

     for (int x=0; x<=lastIndex+n;x++){
         System.out.println(name.substring(x,x+n));
     }

    }
}
