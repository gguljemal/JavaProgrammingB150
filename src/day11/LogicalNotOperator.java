package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {

        // LOGICAL OPERATOR --> ! exclamation mark used to negate the boolean value

        System.out.println(true);
        System.out.println(false);

        System.out.println("The result of ! true --->");
        System.out.println(! true);
        System.out.println("The result of ! false --->");
        System.out.println(! false);

        boolean nothing = false ;
        System.out.println("The result of ! nothing --->");
        System.out.println(! nothing );

        System.out.println("result if ! (7>5) is ");
        System.out.println( ! (7>5) );

        int x = 7 ;
        System.out.println("The result of (x>10) is ");
        System.out.println( x>10 );
        System.out.println("The result of ! (x>10) is ");
        System.out.println( ! (x>10)  );


    }
}


