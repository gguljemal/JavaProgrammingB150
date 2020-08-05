package day11;

public class SwitchPractice {

    public static void main(String[] args) {

        /*
        *create a variable targetOption as String and assign one of below options
        * you have 4 switches in your home to turn on
        * Bd-->bedroom
        * Lr---living room
        * Ki---kitchen
        * Hal---Hallway
        * use switch statement to write a program to print which room light is
        * turn on, then print you have turned on bedroom light
         */

        String targetOption="Mr";

        switch (targetOption){
            case"Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case"Lr":
                System.out.println("You have turned on living room light");
                break;
            case"Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Hal":
                System.out.println("You have turned on hallway light");
                break;
            default: System.out.println("There is no such light!");
        }

    }
}
