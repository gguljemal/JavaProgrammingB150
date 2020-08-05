package day30;

import java.util.Arrays;

public class Split2Method {

    public static void main(String[] args) {

       String sentence = "I love Java Java Java";
//1-
       String words [] = sentence.split(" ");
        System.out.println("words = " + Arrays.toString(words));
        System.out.println("Words Array size: "+words.length);
//2-
        String word [] = sentence.split(" ",3);
    }
}
