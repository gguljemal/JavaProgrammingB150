package day25;

import java.util.Arrays;

public class FindLongestWord {

    public static void main(String[] args) {

        String sentence = "We all love Java Coding intensively all the time";

        String words [] = sentence.split(" ");

        System.out.println("words = " + Arrays.toString(words));
        System.out.println("How many index do I have----> "+words.length);

        String longestWord="Java";
        for (String word : words) {
            System.out.println("word = " + word);

            if(word.length() > longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("longestWord is = " + longestWord);


    }
}
