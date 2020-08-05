package day12;

public class SeasonFinder {

    public static void main(String[] args) {

        /*
        *Create a variable called month with data type int
        * And write an if else if else statement to do following
        * If the month is less than 1 or more than 12 --->INVALID MONTH
        * if the month is between 3-5 print it's spring
        * if the month is between 6-8 print it's summer
        * if the month is between 9-11 print it's fall
        * if the month is 12,1,2 print it's Winter!
         */
        int month = 10;

        if (month<1 || month>12){
            System.out.println("INVALID MONTH!!!");
        }
        else if(month>=3 && month<=5){
            System.out.println("It's spring!!!");
        }
        else if(month>=6 && month<=8){
            System.out.println("It's summer!!!");
        }
        else if (month>=9 && month<=11){
            System.out.println("It's fall!!!");
        }
        else if (month==12 || month==1 || month==2)
        {System.out.println("Winter!!!");}

    }
}
