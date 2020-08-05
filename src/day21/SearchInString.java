package day21;

import java.util.Scanner;

public class SearchInString {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String name = scan.nextLine();

      int lastIndex = name.length()-1;

      //find index of all letter "a" in cases insensitive manner
        for(int x=0; x<=lastIndex; x++){

            String currentChar = name.substring(x,x+1);

            if (currentChar.equalsIgnoreCase("a")){

                System.out.println("INDEX OF A-a: "+x);

            }
        }

    }
}
