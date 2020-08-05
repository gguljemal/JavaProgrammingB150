package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        /*
        Task 3:
        *create an interactive program to ask user for day
        * and generate minute that day have
         */
        /*
        Task 4:
        * Create an interactive program to ask user for hourly wage
        *and generate yearly salary, assume that he works 2080 hour for a year.
         */


        //Task:3

        Scanner scan = new Scanner (System.in);

        System.out.println ("How many day? : ");

        int day = scan.nextInt();

        int minute = day*1400;

        System.out.println("It will be "+ minute+" minute" );

        //task 4:

        System.out.println("What is your hourly wage?: ");

        double salary = scan.nextDouble();

        double yearlySalary = 2080 * salary;

        System.out.println("Your yearly salary is: " + yearlySalary);








    }
}
