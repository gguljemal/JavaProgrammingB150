package day27;

import java.util.Arrays;

public class StringMultiDPractice {

    public static void main(String[] args) {

        String names [][]={ {"Seth","Hasan"} , {"Maya","Bahar"} };

        //print Hasan:
        System.out.println(names[0][1]);
        //print:bahar
        System.out.println(names[1][1]);
        //if I change Bahar to Elif
        names[1][1]="Elif";
        System.out.println(names[1][1]);
        //print Maya and Elif
        System.out.println(Arrays.toString(names[1]));
        //print all arrays
        System.out.println(Arrays.deepToString(names));
    }
}
