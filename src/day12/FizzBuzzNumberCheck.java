package day12;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        /*
        *if this number can be divided by 5 without remainder lets print it Fizz number
        *if this number can be divided by 3 without remainder lets print it Buzz number
        * if this number can be divided by bot 3 and 5 without remainder lets print
        * it FizzBuzz number
        */


        int num = 5;

        if (num % 5==0){
            System.out.println("it Fizz number");
        }
        else if (num %3==0){

            System.out.println("it Buzz number");
        }
        else if (num%5==0 && num %3==0) {
            System.out.println("it FizzBuzz number");
        }
    }
}
