package day20;

public class PalindromeTest {

    public static void main(String[] args) {

   // if you reverse a String it does not change it means
   // it means the string is Palindrome
   //level, kayak, elle, madam, aziza

        String name ="kayak";

        System.out.println("name = "+ name);

        String reverseName="";

        int lastIndex=name.length()-1;

        for(int x= lastIndex;x>=0;--x){

            reverseName=reverseName+name.charAt(x);
        }
        System.out.println("Reversed name is: "+reverseName);

        if (name.equalsIgnoreCase(reverseName)){
            System.out.println("Test has passed");
        }else {
            System.out.println("Test has failed");
        }
    }
}
