package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        //give me the sum of odd numbers from 10-100

        int sumOdd=0;
        int sumEven=0;
        int countOdd=0;
        int countEven=0;
        for(int x=10; x<=100; ++x){

            if(x%2!=0){
                System.out.println("This is odd number "+x);
                sumOdd=sumOdd+x;
                countOdd++;
            }else if(x%2==0){
                System.out.println("This is even number "+x);
                sumEven=sumEven+x;
                countEven++;
            }
        }
        System.out.println("sum of odd= " + sumOdd);
        System.out.println("Odd numbers count: "+countOdd);
        System.out.println("sum of even= "+sumEven);
        System.out.println("Even numbers count: "+countEven);
    }
}
