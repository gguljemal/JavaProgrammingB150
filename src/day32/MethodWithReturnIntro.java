package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        //or we cannot save in variable and use directly
        System.out.println("result of doubling 100 is " + doubleTheNumber(100));
        System.out.println(doubleTheNumber(15));

        int sum = add2Numbers(6,3);
        System.out.println("sum = " + sum);
        System.out.println("sum of two number is " + add2Numbers(6,8));
    }

    // create a method called add , accept 2 int parameter
    //and return the result as int
    public static int add2Numbers(int num1 ,int num2){
        //or int sum = num1+num2;
        //return sum;
        return num1+num2;
    }

    //create a method giveMeMyName
    //it returns your name as a result
    public static String giveMeMyName(){

        return "Akbar";
    }

    //create a static method that double the value of a number
    //it accept 1 int parameter and return double value of that number

    public static int doubleTheNumber(int num){

        System.out.println("I am going to double the value of " + num);
        int result = num*2;
        return result;
    }
}
