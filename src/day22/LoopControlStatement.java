package day22;

import java.util.Scanner;

public class LoopControlStatement {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String letter =scan.nextLine();

        for (int i = 0; i <= letter.length()-1 ; i++) {

            if (i%2==1){
                continue;
            }
            System.out.print(letter.substring(i,i+1));
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        for (int n = 0; n <=letter.length()-1 ; n++) {

            if (letter.substring(n,n+1).equalsIgnoreCase("a")){

                break;
            }
            System.out.print(letter.substring(n,n+1));
        }
    }
}
