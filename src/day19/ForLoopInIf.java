package day19;

import java.util.Scanner;

public class ForLoopInIf {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed:");

        int start =scan.nextInt();
        int end=scan.nextInt();

        if(start<end){
            System.out.println("INCREASING THE SPEED");
            for(int i=start;i<=end;i++){
                System.out.print(i+" ");
            }
        }else if(start>end){
            System.out.println("DECREASING THE SPEED");
            for(int x=start; x>=end; x-- ){
                System.out.print(x+" ");
            }
        }else {
            System.out.println("NO ACTION NEEDED!!!SAME SPEED!!!");
        }
    }
}
