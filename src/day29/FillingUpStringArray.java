package day29;

import java.util.Arrays;

public class FillingUpStringArray {

    public static void main(String[] args) {

   // Create an array with size 300 and fill it up with "I Love Java"

        String words [] = new String[300];

        System.out.println("before filling the value: "+words);

//        words [0] = "I Love Java";
//        words [1] = "I Love Java";
//        words [2] = "I Love Java"; .........-->til words[299]="I Love Java";


        for (int i = 0; i < words.length; i++) {

            words [i] = "I Love Java";
        }
        System.out.println(Arrays.toString(words));

    }
}
