package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        //if a number can be divided by both 3 and 5--->>?FizzBuzz number
        //if a number can be divided by both 5--->>?Fizz number
        //if a number can be divided by both 3--->>?Buzz number

        int num=1;
       while(num<=47) {

           if (num % 3 == 0 && num % 5 == 0) {
               System.out.println(num + " is Fizz Buzz number");

           } else if (num % 3 == 0) {
               System.out.println(num + " is Buzz number");

           } else if (num % 5 == 0) {
               System.out.println(num + " is Fizz number");

           }
           ++num;
       }
        System.out.println("number is: "+num);
    }
}
