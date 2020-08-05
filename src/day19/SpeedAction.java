package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int start, end;

        System.out.println("Enter starting speed and ending speed");
        start=scan.nextInt();                  //10;
        end=scan.nextInt();                    //27;
//        for ( start =10; start<=27; start++){
//
//            System.out.println("speed limit: "+start);
//        }
        for(int i=start; i<=end;i++){

            System.out.println("you have started at speed--->>");
            System.out.print(i+" ");
        }

    }
}
