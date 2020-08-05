package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String name = "Anastasiya";

 //    pick up your own name and turn into char array
//     and use fro each loop to loop over them
//     optionally count how many a you have in your name

        char nameCharacters [] = name.toCharArray();

        System.out.println("Before sorting nameCharacters: " + Arrays.toString(nameCharacters));

        for (char character : nameCharacters ){

            System.out.println("character = " + character);
        }
        //how many a we have

        int count = 0;
        for (char character : nameCharacters ){

           if (character=='a'){
               ++count;
           }

        }   System.out.println("count of a = "+count);

//        what if you want to sort all characters of your name
//        in alphabetic order

        Arrays.sort(nameCharacters);

        System.out.println("After sorting nameCharacters: " + Arrays.toString(nameCharacters));

    }
}
