package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        /* Create a variable called YourOrder, type String and assign a value
         * create another variable called myOrder and assign the value
         * to the same value as yourOrder by copying and just them out
         */

        System.out.println("What is your order?: ");
        String yourOrder= input.nextLine();
        String myOrder= yourOrder;
        System.out.println("Your order is: "+ yourOrder+"\n"+"My order is: "+myOrder);

             }
}
