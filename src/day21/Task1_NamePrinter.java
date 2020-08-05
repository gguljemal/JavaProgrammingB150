package day21;

import java.util.Scanner;

public class Task1_NamePrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myName =scan.nextLine();
        int lastIndex=myName.length()-1;

        for(int x=0; x<=lastIndex ;x++ ){

//            System.out.print(myName.substring(x,x+1)+"->");or
            System.out.print(myName.charAt(x)+"->");
        }

        System.out.println("------------------------------------------");
//                 or  lastIndex-1
        for(int x=0; x<myName.length()-2;x++){

            System.out.print( myName.substring(x,x+2)+"->");
        }
    }
}
