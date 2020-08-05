package day24;

import java.util.Arrays;

public class ArraysEqualMethod {

    public static void main(String[] args) {

     int scores1 [] = {2,5,6,7,3,34,6};
     int scores2 [] = {22,45,6,37,3,6,9};
     int scores3 [] = {2,5,6,7,3,34,6};
     int scores4 [] = {6,5,6,7,3,2,34}; //it has same numbers as 3 but different order

        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);
//     for checking for equality of 2 array object content
//     equals-----> Arrays.equals(1Array,2Array)

        boolean equal13Not = Arrays.equals(scores1,scores3);
        System.out.println(equal13Not);

        boolean equal12Not = Arrays.equals(scores1,scores2);
        System.out.println(equal12Not);

        boolean equal34Not = Arrays.equals(scores3,scores4);
        System.out.println(equal34Not);

        System.out.println("After sorting comparing if 3-4 are equal");

        Arrays.sort(scores3);
        Arrays.sort(scores4);

        System.out.println(Arrays.equals(scores3,scores4));
//      or equal34Not = Arrays.equals(scores3,scores4);
//      System.out.println(equal34Not);



    }
}
