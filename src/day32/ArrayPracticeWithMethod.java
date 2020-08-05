package day32;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

              printArray(new int[]{1,6,5,3,12,3});

              int scores [] ={2,5,8,23,4,5,6};
              printArray(scores);

              printMaxOfIntArray(new int[]{15,20,9,63,99});
              printMaxOfIntArray(scores);

              printMinOfIntArray(scores);
              printMinOfIntArray(new int[]{15,20,9,63,99});

              printSumOfIntArray(scores);

              compare2arraySize(new String[]{"Sezgin","senay","ser","cgjbhfj"},new String [] {"ser","lons"} );
    }

    //create method that has one int array as a parameter
    //print out each item in this format
    //array has items : ---->> all the items here

    public static void printArray(int numbers []){

        System.out.println("array has items: " + Arrays.toString(numbers));
    }

    //printMaxOfIntArray
    //this method has one int array as parameter
    //and it will print the max number inside the array

    public static void printMaxOfIntArray(int numbers []){

        int numMax = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {

            if (numMax<numbers[i]) {
                numMax=numbers[i];
            }
        }
        System.out.println("max number is "+ numMax);
    }

    public static void printMinOfIntArray(int numbers []){

        int numMin = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {

            if (numMin>numbers[i]) {
                numMin=numbers[i];
            }
        }
        System.out.println("min number is "+ numMin);
    }

    //printSumOfIntArray
    //this method has one int array as parameter
    //and it will print the sum of the numbers

    public static void printSumOfIntArray(int numbers [] ){

        int sum = 0;

        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println("Sum is " + sum);
    }
    //compare2arraySize
    //create a method that accept 2 String array object
    //and compare the item counts inside these 2 arrays
    //if arr1 is more than print array 1 has more item
    //if arr2 is more than print array 2 has more item
    //else print they have same item count

    public static void compare2arraySize(String arr1 [], String arr2 []){

        if (arr1.length>arr2.length){
            System.out.println("arr1 is more than print array 1 has more item");
        }else if (arr1.length<arr2.length){
            System.out.println("arr2 is more than print array 2 has more item");
        }else {
            System.out.println("they have same item count");
        }
    }
}
