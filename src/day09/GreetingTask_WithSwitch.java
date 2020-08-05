package day09;

public class GreetingTask_WithSwitch {

    public static void main(String[] args) {

        /*assume you are on the call and you have been given option to be
         *greeted by the language of your choice according to the number you provided
         *create a variable called languageOption and assign value,
         *  string variable called greeting, assign a empty String
         * 1-->"Hello"
         * * 2-->"Salam"
         * * 3-->"Hola"
         * * 4-->"Privet"
         * * 5-->"Merhaba"
         * * 6-->"Szia"
         * * 7-->"Bonjour"
         *
         * The program should set the value of a String variable called greeting
         * to this value: 1--->>"Hello,SDET"
         * Print out-->> This is how the greeting massage you get:"Hello,SDET"
         */

        int languageOption=1;
        String greeting = "";

        switch (languageOption) {
            case 1:
                greeting = "Hello!";
                //or system.out.println("Hello!");
                break;
            case 2:
                System.out.println("Salam!");
                break;
            case 3:
                System.out.println("Hola!");
                break;
            case 4:
                System.out.println("Privet!");
                break;
            case 5:
                System.out.println("Merhaba!");
                break;
            case 6:
                System.out.println("Szia!");
                break;
            case 7:
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Unknown!");
        }
            System.out.println("This is how the greeting message you get: "+greeting);

    }
}
