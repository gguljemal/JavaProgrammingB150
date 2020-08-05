package day09;

public class GreetingTask {

    public static void main(String[] args) {

        /*assume you are on the call and you have been given option to be
         *greeted by the language of your choice according to the number you provided
         *create a variable called languageOption and assign value,
         *  string variable called greeting, assign a empty String
         * 1-->"Hello"
         * * 1-->"Salam"
         * * 1-->"Hola"
         * * 1-->"Privet"
         * * 1-->"Merhaba"
         * * 1-->"Szia"
         * * 1-->"Bonjour"
         *
         * The program should set the value of a String variable called greeting
         * to this value: 1--->>"Hello,SDET"
         * Print out-->> This is how the greeting massage you get:"Hello,SDET"
         */

        String greeting = "";
        int languageOption = 2;

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";
        } else if (languageOption == 7) {
            greeting = "Bonjour";
        } else {
            System.out.println("There is no more choice");
        }

        greeting=greeting+" ,SDET";

        System.out.println("This is how the greeting you get "+greeting);
    }

    }

