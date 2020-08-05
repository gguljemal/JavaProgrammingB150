package day34;

public class PracticeMethodWithNumbers {

    public static void main(String[] args) {

        System.out.println(buildDigitNumber(6,3,6));// or
        int result1 = buildDigitNumber(6,3,6);
        System.out.println("result1 = " + result1);

        System.out.println(buildDigitNumber(6,14,0));//or
        int result2 = buildDigitNumber(6,14,0);
        System.out.println("result2 = " + result2);

        //add the result of first two method call
        System.out.println("result2 +result1 = " + (result2 + result1)  ) ;
        System.out.println(result2 + result1+" is result of result 1 + result2 ");
    }
    /*
    write a method called buildDigitNumber
    it has 3int parameters digit1 digit2 digit3
    and it will return the 3 digit numbers you have build
    if any of digit1 digit2 digit3 is not within the range of 0-9 then change it to 0,
    ---->> buildDigitNumber(4,2,4)==== 424
           buildDigitNumber(0,2,1)==== 21
           buildDigitNumber(65,6,9)=== 69
     */

    public static int buildDigitNumber(int digit1,int digit2, int digit3){

        //376 ----->> digit1 is 3, digit2 is 7,digit3 is 6

        digit1=3;
        digit2=7;
        digit3=6;

        if (digit1<0 || digit1>9){
            digit1=0;
        }
        if (digit2<0 || digit2>9){
        digit2=0;}
        if (digit3<0 || digit3>9){
            digit3=0;
        }

        int number = digit1*100+digit2*10+digit3;

        return number;
    }
}
