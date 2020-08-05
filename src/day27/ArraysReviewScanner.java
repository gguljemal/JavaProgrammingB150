package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReviewScanner {

    public static void main(String[] args) {

//Task01: write a program that asks user to enter a number 5 times,
// and store those number into array

        Scanner scan = new Scanner(System.in);

        int numbers [] = new int[5];
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter an int number: ");
            int input = scan.nextInt();
            numbers[i]=input;
        }System.out.println(Arrays.toString(numbers));

//       print the largest number

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int largestNum = numbers[numbers.length-1];
        System.out.println("Largest number is: "+largestNum);

        int minNum = numbers[0];
        System.out.println("Minimum number is: "+minNum);




    }
}
