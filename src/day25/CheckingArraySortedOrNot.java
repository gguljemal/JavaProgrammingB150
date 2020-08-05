package day25;

import java.util.Arrays;

public class CheckingArraySortedOrNot {

    public static void main(String[] args) {

        int numbers [] = {13,31,8,5,21,2};

        System.out.println("numbers = " + Arrays.toString(numbers));
       // storing the size of an array into a variable
        int numbersLong = numbers.length;
        //I want to copy the content of numbers array into the new array

        //creating an array with same size as original array
        int copyNumbers [] = new int[numbers.length];
 //       copyNumbers[0]=numbers[0];  //13;  //copying one by one from original array
 //       copyNumbers[1]=numbers[1];
//        copyNumbers[2]=numbers[2];
 //       copyNumbers[3]=numbers[3];
//        copyNumbers[4]=numbers[4];
//        copyNumbers[5]=numbers[5];

        for (int i = 0; i < numbers.length ; i++) {

            copyNumbers[i]=numbers[i];
        }
        System.out.println("Before sort copyNumbers = "+Arrays.toString(copyNumbers));

       Arrays.sort(copyNumbers);
        System.out.println("After sort copyNumbers = "+Arrays.toString(copyNumbers));

        //check whether the array still have same content in same order after sorting
        //what method will check for content

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        if (Arrays.equals(numbers,copyNumbers)){
            System.out.println("THIS ARRAY IS SORTED");
        }else{
            System.out.println("THIS ARRAY IS NOT SORTED");
        }

    }
}
