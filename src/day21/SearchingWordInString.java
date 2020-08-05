package day21;

import java.util.Scanner;

public class SearchingWordInString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int lastIndex=name.length()-1;

        int count=0;

        for(int x=0; x<=lastIndex-1;x++){

            String currentChar=name.substring(x,x+2);

            if(currentChar.equalsIgnoreCase("gu")){

                System.out.println("an character is in index: "+x);

                count++;
            }

        }
        System.out.println("count = " + count);

    }
}
