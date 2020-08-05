package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {

    public static void main(String[] args) {

        /*
         *what do you do in each season
         * spring-->>Hike, Easter, Nawruz, Blossom
         * Summer-->>Swim, Vacation, BBQ, Holiday
         * Fall-->>Black Friday, Hiking, Harvest, Halloween, Shopping
         * Winter-->>Snowboard, Ski, Christmas, New Year
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the season?!");

        String season = scan.next();

        switch (season) {
            case "Spring":
                System.out.println("Hike, Easter, Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("Snowboard, Ski, Christmas, New Year");
                break;
            default:
                System.out.println("");
        }
    }
}
