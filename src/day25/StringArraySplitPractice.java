package day25;

import java.util.Arrays;

public class StringArraySplitPractice {

    public static void main(String[] args) {

        String sentence = "Everything is Awesome!!!";

        String words [] = sentence.split("e");

        System.out.println("words = " + Arrays.toString(words));
        System.out.println("how many index---> "+words.length);

        for (String word :words) {
            System.out.println("word = " + word);
        }
//       split this sentence by is and print out your result

        String split [] = sentence.split("is");
        System.out.println("split = " + Arrays.toString(split));
        System.out.println("how many words it has----> "+split.length);
    }
}
