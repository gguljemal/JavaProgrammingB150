package day27;

import java.util.Arrays;

public class ForEachLoopIn2D {

    public static void main(String[] args) {

        int numbers [][] = { {10,20,30} , {40,50,60,70,80,90} };
        //index                 0                  1

        for (int [] number1D : numbers) {

            System.out.print(Arrays.toString(number1D));

            for (int number : number1D) {
                System.out.print(number+" ");
            }

        }  
    }
}
