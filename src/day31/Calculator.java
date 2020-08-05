package day31;

public class Calculator {

    public static void main(String[] args) {

        //create a static method that add
        //it accept 2 numbers and print the result of addition
        add(6,2);
        add(100,30);
        add3Numbers(20,9,64);
        add3Numbers(3,6,7);
    }

    public static void add (int num1, int num2){

        System.out.println("addition result = "+ (num1+num2) );

    }

    public static void add3Numbers (int num1,int num2,int num3){
        System.out.println("Add 3 numbers result = " + (num1+num2+num3) );
    }
}
