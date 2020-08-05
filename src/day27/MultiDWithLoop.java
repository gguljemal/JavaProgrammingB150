package day27;

import java.util.Arrays;

public class MultiDWithLoop {

    public static void main(String[] args) {

      int numbers [][] = { {1,2,3} , {4,5,6} , {7,8,9}, {10,11,12,13}};
      //        index         0         1          2          3

        for (int i = 0; i < numbers.length ; i++) {

            System.out.println("numbers " +i+"="+ Arrays.toString(numbers[i]));
        }

        System.out.println("-------------------------------------------");
        //print all numbers 1 2 3 4 5 6 7 8 9

        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] +" ");
            }
        }
        System.out.println();

        System.out.println("------------------------------------------");

        //Print the all even numbers from 2D Array

        int age [][] = { {10} , {12,13,14,15,16,17} , {19,20,21,22,23} };

        for (int i = 0; i < age.length ; i++) {

            for (int j = 0; j < age[i].length; j++) {

                if (age[i][j]%2!=0){
                    continue;
                }
                /*
                or we can do it
                if (ages[i][j]%2==0){
                System.out.print(age[i][j]+" ");}
                 */
                System.out.print(age[i][j]+" ");
            }
        }
    }
}
