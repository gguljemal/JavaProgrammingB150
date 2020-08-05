package day05;

public class VariablePractice {

    public static void main(String[] args) {

        /*
        line1
        line2
        line3 this type is called BLOCK comment, everything in between will be seen as comment
        */

        //8 primitive variables

        /*
        whole number     : byte,short, int, loan
        fractional number: float, double
        logical          : boolean (true, false)
        character        :char (single character in single quote )

         *** usually by default for whole number: just use int
         *** usually by default for fractional number : just use double

         IS STRING primitive? NOOOO!!!  (It is sequence of character)

         */

        int birthYear = 2011;
        int currentYear = 2019;
        int age= currentYear-birthYear;

        // I was born in year 2001, and I am 18 years old;

        System.out.println("I was born in year 2001, and I am 18 years old");

        //or

        System.out.println ("I was born in year " + 2001 + " and I am "+ (2019-2001)+" years old");

        System.out.println("I was born in year "+ birthYear+", and I am "+ age+ " years old" );

        //task2: you are speeding today
        //speed limit is some number, and your current speed is this
        //generate this out of: You are driving 10mph more than speed limit

        int speedLimit = 65;
        int currentLimit= 60;
        int overTheLimit=75;

        System.out.println ("In this road speed limit is " + speedLimit+
                " ,we are driving " + currentLimit+
                " mph, but look at that car driving too fast its speed is "
                + overTheLimit + " mph I think");






    }
}
