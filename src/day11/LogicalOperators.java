package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("Truth table");
        System.out.println("Result of true && true is " + (true && true) );
        System.out.println("Result of false && true is " + (false && true) );
        System.out.println("Result of true && false is " + (true && false) );
        System.out.println("Result of false && true is " + (false && true) );

        // pipe example

        System.out.println("Truth table");
        System.out.println("Result of true || true is " + (true || true) );
        System.out.println("Result of false || true is " + (false || true) );
        System.out.println("Result of true || false is " + (true || false) );
        System.out.println("Result of false || true is " + (false || true) );

        //create a variable called num with type int
        //find out whether this number is more than 100 or less than 10
        //find out th number is within the range of 10-60
        //and print out the result

        int x = 55;
        //System.out.println(num>100 || num<10);
        //System.out.println( num>60 && num<10);

        //more than 2 conditions at the same time, 3 conditions

                                    //true||false ---------->>true
        System.out.println (true || false ||false);

                                   //true && false --------->>false
        System.out.println(true && true && false);

                            //false||false-->false|| true ---->>true
        System.out.println( x==50 || x==51 ||        x==55);

        // check x is more than 50 and x is not equal to 52 or x equal to 57

        System.out.println(x>50 && x != 52 || x==57) ;
    }
}
