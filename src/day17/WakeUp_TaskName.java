package day17;


public class WakeUp_TaskName {

    public static void main(String[] args) {


    String name, name2;

        System.out.println("Write your name please! ");
        name="Maya";
        //get the first character --->make it uppercase
        //get the rest of the characters starting from 2nd character
        //then make it lowercase,eventually concatenate them

//        String nameFix= (name.charAt(0)+" ").toUpperCase();
//        nameFix=nameFix+name.substring(1).toLowerCase();
//        0123
//        maya
        String nameFix=name.substring(0,1).toUpperCase();
        nameFix+=name.substring(1).toLowerCase();

        System.out.println(nameFix);


    }
}
