package day06;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myNumber=300;
        int yourNumber=myNumber;

        System.out.println("My favorite number "+myNumber);
        System.out.println("Your favorite number "+yourNumber);

        yourNumber=100;

        System.out.println("My favorite number "+myNumber);
        System.out.println("Your favorite number "+yourNumber);

        /* Create a variable called YourOrder, type String and assign a value
        * create another variable called myOrder and assign the value
        * to the same value as yourOrder by copying and just them out
         */

        String yourOrder = "Gucci Bag";
        String myOrder= yourOrder;

        System.out.println("Your order "+yourOrder);
        System.out.println("My order "+myOrder);

        myOrder="choklate";
        System.out.println("Your order "+yourOrder);
        System.out.println("My order "+myOrder);








    }
}
