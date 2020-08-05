package day10;

public class AnswerWithMain {

    public static void main(String[] args) {

        /*
        *
         */

        String myAnswer = "";
        int myNumber = 7;
        myNumber = myNumber%5;

        if(myNumber==0){
            myAnswer="Fizz Number";
        }
        else {myAnswer="Not a Fizz Number";}

        System.out.println("Print my number is "+myNumber+", it is "+myAnswer);


    }
}
