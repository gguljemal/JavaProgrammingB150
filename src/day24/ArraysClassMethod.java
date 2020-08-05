package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

    String superHeros [] = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

   //     System.out.println(superHeros); the RESULT will nonsense

        System.out.println(    Arrays.toString(superHeros)   );

        String ArrayToString = Arrays.toString(superHeros);

        System.out.println(ArrayToString);

        //how do we get first character of ArrayToString (String) variable

        System.out.println("First character of Srting");
        System.out.println(ArrayToString.charAt(0));

        int numbers []={10,44,53,5,78};

        System.out.println("Array numbers to String:");
        System.out.println(Arrays.toString(numbers));

    }
}
