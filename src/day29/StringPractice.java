package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

       String hero1 = "Super-Clark Kent";

       // HERO code is Superman and Identity is Clark Kent
        // the initial of the HERO is CK

        String hero [] = hero1.split("-");
        System.out.println(Arrays.toString(hero));

        //Hero code is Superman and Identity is Clark Kent
        System.out.println("Hero code is "+hero[0]+" and Identity is "+hero[1]);

        //saving to variable and than concatenate
        String arr1 = hero[0];
        String arr2 = hero[1];//fullname
        System.out.println("Hero code is "+arr1+" and Identity is "+arr2);

        //The initial of the Hero is CK
        //I can just use arr2 variable to finish this task

        String arr2Splitted [] = arr2.split(" ");
        System.out.println(Arrays.toString(arr2Splitted));
        System.out.println("Length arr2Splitted : "+arr2Splitted.length);

        String lastName = arr2Splitted[arr2Splitted.length-1];
        System.out.println("last name: "+lastName);
        System.out.println("Initial of the hero is: "+arr2.charAt(0)+lastName.charAt(0));

    }
}
