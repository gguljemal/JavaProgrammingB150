package day29;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

   // create an int array with size 100 and fill it up as below

   int numbers [] = new int[100];

  //value is not assigned->will give you 0 in result
   System.out.println("Before filling up default value \n"+Arrays.toString(numbers));

        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;//----->and so on till 100
//      ................
//        numbers[99] = 100;


        for (int i = 0; i <numbers.length ; i++) {

            numbers[i] = i+1;
        }
        System.out.println("After filling up \n"+Arrays.toString(numbers));


    }
}
