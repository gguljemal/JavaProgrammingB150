package day16;

import java.util.Scanner;

public class Task1_Reverse {

    public static void main(String[] args) {

        /*
        given a word with 4 characters stored is a String variable word1
        create a String variable called word2 and assign empty value store
        the reverse word1 into word2 and print out
        example: word1=Java
                 word2=avaJ
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String word1=scan.next();
        String word2= ""+ word1.charAt(5)+word1.charAt(4)+word1.charAt(3)
                +word1.charAt(2)+word1.charAt(1)+word1.charAt(0);


        System.out.println(""+word1.charAt(0)+word1.charAt(1)+word1.charAt(2)
        +word1.charAt(3)+word1.charAt(4)+word1.charAt(5));

        System.out.println(word2);

        //I want to add world at the end of it

        String msg = "Hello ";
        msg= msg+"World!";
        //or msg+="World!";
        System.out.println("msg= "+msg);

    }
}
