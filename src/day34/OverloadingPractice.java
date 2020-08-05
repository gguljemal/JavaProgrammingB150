package day34;

public class OverloadingPractice {

    public static void main(String[] args) {
            add(20);
            add(10,20);
            add(15L,23L);
            add(6,9,7);
    }
    /*
    create 3 static void overloaded version of add method
    1-add
    has 1 int parameter and add 100 to that number and print out the result
    2-add
    has 2 int parameter and add  them to get sum and print out the result
    3-add
    has 3 int parameter and add  them to get sum and print out the result
    4-add
    has 2 long parameter and add  them to get sum and print out the result
     */
    public static void add (int num ) {
        int sum = num +100;
        System.out.println(sum);

        //or we can use other method add(num1,100)
    }
    public static void add (int num1,int num2){
        int sum = num1+num2;
        System.out.println(sum);

    }
    public static void add (int x,int y, int z){
        int sum = x+y+z;
        System.out.println(sum);
    }
    public static void add (long num1, long num2){
        long sum = num1+num2;
        System.out.println(sum);
    }
}
