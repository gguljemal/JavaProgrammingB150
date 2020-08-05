package day25;

import java.util.Arrays;

public class SortedOrNot2 {

    public static void main(String[] args) {

        int numbers [] = {13,31,8,5,21,2};
//        int numbers [] = {1,2,3,4,5,6}

        System.out.println("numbers = " + Arrays.toString(numbers));

//      CREATE A VARIABLE CALLED isSortedAlready and assign value of true;
//      I ASSUME TH ARRAY IS ALREADY SORTED
//      AND IF IT IS NOT THEN CHANGE the value of isSortedAlready to FALSE

        for (int i = 0; i < numbers.length-1 ; i++) {

            System.out.println(numbers[i]+" "+numbers[i+1]+" ? "+(numbers[i]<numbers[i+1]));

            //pick first item and compare with second item
            //keep repeating until there is no more item

            if(   !(numbers[i]<numbers[i+1])  ) {
                System.out.println("ARRAY IS NOT SORTED, NO POINT CHECKING THE REST");
                break;
            }

        }
    }
}
