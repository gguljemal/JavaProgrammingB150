package day11;

public class EqualityPractice {

    public static void main(String[] args) {

        //Create a program to check whether myStr value is Java
        //if true --->> CORRECT WORD!!!
        //if false --->> SAY JAVA!!!

        String myStr = "Cava";

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!");
        }
        else {System.out.println("SAY JAVA!!!");}

        /*
        *check the value of myStr
        * if it is Java--->> CORRECT WORD!!!
        *if it is Cava --->> Pumpkin!!!
        * else say NOT JAVA NOR PUMPKIN
         */

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!");
        }
        else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin!!!");
        }
        else { System.out.println("NOT JAVA NOR PUMPKIN");}

    }

}
