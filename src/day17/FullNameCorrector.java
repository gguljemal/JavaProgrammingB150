package day17;

import java.util.Scanner;

public class FullNameCorrector {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name please!!");


//                         0123456789
        String fullName = scan.nextLine();
        //int spaceOfIndex=fullName.indexOf" "--->is 4.

        String correcting=fullName.substring(0,2).toLowerCase();
        correcting+=fullName.substring(2,3).toUpperCase();
        correcting+=fullName.substring(3,6).toLowerCase();
        correcting+=fullName.substring(6,7).toUpperCase();
        correcting+=fullName.substring(7,9);
        correcting+=fullName.substring(9).toUpperCase();

        System.out.println(correcting);
    }
}
