package day18;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);

        System.out.println("KNOCK KNOCK!!");

        String num ;

        do{
            System.out.println("WHAT'S THE PASSWORD?");
            num=scan.next();
        }while(!num.equalsIgnoreCase("b15"));

        System.out.println("DOOR IS OPEN!!!");
    }
}
