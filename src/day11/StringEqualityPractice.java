package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        System.out.println("Java".equals("java") );

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println("is my string same as your string?");
        System.out.println(myStr.equals(yourStr));

        //Create a program to check whether myStr value is Java
        //if true --->>CORRECT WORD!!!
        //If false--->>SAY JAVA!!!

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!");
        }
        else{
            System.out.println("SAY JAVA!!!");
        }


    }
}
