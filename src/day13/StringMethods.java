package day13;

public class StringMethods {

    public static void main(String[] args) {

      //String action that we already know so far:
      //equals
      String s1 ="hello";
      System.out.println(s1.equals("abc") );
      //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("hello"));

        //toUpperCase method of String is used to make String all character uppercase

        System.out.println(s1              );
        System.out.println(s1.toUpperCase());

        //toLowerCase method of String is used to
        //make String all character lowercase
        System.out.println(s1.toLowerCase());

        /*
        *store your name into a variable
        * print your name in upper case, you may concatenate "MY NAME IS: YOUR NAME"
        * print your name in all lowercase:
        * you may optionally concatenate "my name is: your name"
         */

        String name = "Maya";
        String name1 = "Gurban";

        System.out.println("MY NAME IS: "+name.toUpperCase()  );

        System.out.println("my name is: "+name1.toLowerCase() );

        // in order to get how many character we have inside String
        //we can use length method of String

        System.out.println(name1.length() );
        System.out.println(name.length() );

        int lengthOfStr = name1.length();

        if (lengthOfStr>6){
            System.out.println("More than 6 character");
        }
        else {System.out.println("not more than 6 character");}

    }
}
