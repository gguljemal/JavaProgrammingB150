package day12;

import java.util.Scanner;

public class SeasonTask_Equal {

    public static void main(String[] args) {

        /*
        *create a string variable season
        * assign value by asking user question: Enter your season Please!!!
        * check the season using if statements without caring about the case
        * If Spring --->Hiking, Navruz, Allergy Season, Cool weather
        * if Summer --->Pool, Swimming, Beach, Vacation
        * If Fall--->Barbecue, riding bike,JUST CODE!!!,Halloween
        * If Winter--->Code!!!Ski, Sledding, Snowman
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season please!!!");

        String season= scan.next();

        if (season.equalsIgnoreCase("Spring")){

            System.out.println("Hiking, Navruz, Allergy Season, Cool weather");
        }
        else if(season.equalsIgnoreCase("Summer")) {
            System.out.println("Pool, Swimming, Beach, Vacation");
        }
        else if (season.equalsIgnoreCase("Fall")){

            System.out.println("Barbecue, riding bike,JUST CODE!!!,Halloween");
        }
        else if(season.equalsIgnoreCase("Winter")) {

            System.out.println("Code!!!Ski, Sledding, Snowman");
        }
        else {System.out.println("There is no such season!!!");}


    }
}
