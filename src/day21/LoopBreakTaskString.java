package day21;

import java.util.Scanner;

public class LoopBreakTaskString {

    public static void main(String[] args) {

    //store your name into a variable name
    //loop through each and every letters and print
    //if you see letter b ---> get out of the loop

        Scanner scan=new Scanner(System.in);

        String name=scan.nextLine();
        int lastIndex=name.length()-1;

        for(int x=0; x<=lastIndex;x++){

//            System.out.print(name.substring(x,x+1));

            if(name.substring(x,x+1).equalsIgnoreCase("l"))
            {
                break;
            }
            System.out.print(name.substring(x,x+1));
        }

//        or we can do it with char

        for(int x=0; x<=lastIndex;x++){

            char currentChar=name.charAt(x);
            System.out.println(currentChar);

            if(currentChar=='l' || currentChar=='L'){//case sensitive
                break;
            }
            System.out.println(currentChar);
        }





    }
}
