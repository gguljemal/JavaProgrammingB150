package day24;

import java.util.Arrays;

public class ArraysTask {

    public static void main(String[] args) {

 //  create an double array of 3 items; and put 3 value
 //  get a string representation out of this array and save it as priceString
 // print each and every character in this String in this format
 //character at index 1 is: yourCharacterHere
 //character at index 2 is: yourCharacterHere and so on all way till last

 double prices []={33.5, 35.9, 20.0};

 String priceString = Arrays.toString(prices);

        System.out.println(priceString);

        for (int i = 0; i < priceString.length() ; i++) {

            System.out.println("character at index " + i + " is : "+ priceString.charAt(i));

        }
    }
}
