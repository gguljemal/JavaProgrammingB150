package day22;

import java.util.Scanner;

public class ScannerLoopArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int number [] = new int[10];

        for (int i = 0; i <number.length ; i++) {

            System.out.println("Enter your number "+i);
            number[i]=scan.nextInt();
        }

        for (int x = 0; x < number.length; x++) {

            System.out.print(number[x]+" ");
        }

    }
}
