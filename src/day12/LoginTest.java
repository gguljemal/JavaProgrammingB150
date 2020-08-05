package day12;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {

        /*
        *Create 2 String variable called userName, password
        * your correct username password is user123 and pass123
        * check if your username and password correct
        * if so print login successful
        * if not
        * check whether your username correct
        * if not print, username is not correct
        * check your password is correct or not
        * if not print password is not correct
         */

        Scanner scan = new Scanner(System.in);
        String username, passport;
        username=scan.next();
        passport=scan.next();

        if (username.equals("user123") && passport.equals("pass123")) {

            System.out.println("Login successfully!!!");
        }
        else if ( ! username.equals("user123") && passport.equals("pass123") ) {

            System.out.println("username is not correct");
        }
        else if (! passport.equals("pass123") && username.equals("user123")){

            System.out.println("passport is not correct");
        }

        else {System.out.println("Username and Password incorrect");}
    }
}
