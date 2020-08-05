package day31;

public class MethodPractice3 {

    public static void countDownFrom20() {

        //no need for object when being called             :static
        //it should be accessible anywhere in your project :public
        //it does not return any value                     :void
        //does not need any external data when being called:(nothing inside)

        //create a method called countDownFrom20
        //create a method to print odd numbers from 1-100:PrintOddNumbers1-100()
        //create a method to spell your name: SEDA ---> S-E-D-A

        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void PrintOddNumbers1to100() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void spellName() {

        String name = "SEDA";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "-");

        }
    }

    public static void main(String[] args) {

        countDownFrom20();
        PrintOddNumbers1to100();
        spellName();

    }
}