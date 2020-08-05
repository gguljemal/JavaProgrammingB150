package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
         *Create a program to guess your favorite number
         * create a variable called myFavoriteNumber as int
         * ask user to guess your favorite number
         * if user guessed right then print BINGO!!!
         * if not print try again later
         */
        Scanner scan = new Scanner (System.in);

        System.out.println("Guess my favorite number: ");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber==20) { System.out.println("BINGO!!!");
        }
        else { System.out.println("Try again later!!!");

        }
    }
}
