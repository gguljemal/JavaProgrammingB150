package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keep locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("PLEASE ENTER YOUR PASSWORD:");

        String num = scan.next();

        while (!num.equalsIgnoreCase("B15")){

            System.out.println("WRONG PASSWORD!! TRY AGAIN!!");
            num=scan.next();
        }

        System.out.println("OPEN SESEAME!!!");

    }
}
