package day34;

import java.util.Arrays;

public class MethodReturnMoreThan1Value {

    public static void main(String[] args) {

        String sentence ="I love Java";

        char eachChar [] = sentence.toCharArray();
        String eachWord [] = sentence.split(" ");

        int ArrResult [] = boysVSGirls();
        System.out.println(Arrays.toString(ArrResult));
    }
    public static int [] boysVSGirls (){

        int boysGirls [] = {54,56};

        return boysGirls;
    }
}
