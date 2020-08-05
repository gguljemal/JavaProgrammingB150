package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesiya";
//      how would you store each and every character
//      to an char array from above name
//      without using method we are about to learn
        char nameChar [] = new char[name.length()];

        nameChar[0]=name.charAt(0);
        nameChar[1]=name.charAt(1);  // and so on......

        for (int i = 0; i < name.length(); i++) {
            nameChar[i]=name.charAt(i);
        }
//        System.out.println(nameChar[0]);
       System.out.println("nameChar = " + Arrays.toString(nameChar));

       char nameChar2 [] =  name.toCharArray();
        System.out.println("nameChar2 = " + Arrays.toString(nameChar2));


    }
}
