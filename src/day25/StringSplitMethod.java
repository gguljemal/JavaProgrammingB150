package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String words [] = sentence.split(" ");
        System.out.println("word = " + Arrays.toString(words));
        System.out.println("How many word do I have in this sentence?: "+words.length);

        // how do I get the last word of the sentence using this array i GOT from String
        System.out.println("last word in this sentence is ---> "+words[words.length-1]);


    }
}
