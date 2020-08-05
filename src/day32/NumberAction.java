package day32;

public class NumberAction {

    public static void main(String[] args) {

//        repeatString("Java",3);
//        numberComparision(5,9);
//        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
//        print1toX(5);

//        countDownByEvenNumberFromXtoY(10,6);
//        countDownByEvenNumberFromXtoY(6,10);//NO RESULT!!! incorrect input will not work
    }
    /*
    create static void methods as below
    *numberComparision
    *this method has 2 parameters called num1 and num2
    *if num1 is more than num2 print num1 is more than num2
    *if num2 is more than num1 print num2 is more than num2
    *if num1 is equal num2 print they are equal
     */
public static void numberComparision(int num1, int num2){

    if (num1>num2){
        System.out.println("num1 is more than num2");
    }else if (num1<num2){
        System.out.println("num2 is more than num1");
    }else{
        System.out.println("they are equal");
    }
}
    /*
     repeatString
    this method has 2 parameters
    String strToRepeat and int count
    repeat printing the string as many time as <count> number define
     */
    public static void repeatString(String word, int count){

        for (int i = 1; i <= count ; i++) {
            System.out.println(word + " ");
        }
    }
    /*
    skipCountBy3From0to50
    *create a method that has no parameter
    *and skip count by 3 from 0 to 50
     */

    public static void  skipCountBy3From0to50(){

        for (int i = 0; i <= 50; i=i+3) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /*
    countDownByEvenNumberFrom50to0
    *create a method that has no parameter
    *and count down be even number from 50 to 0
    *example 50, 48, 46............0
     */

    public static void countDownByEvenNumberFrom50to0(){

//        for (int i = 50; i >=0 ; i--) {
//
//            if (i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();

        countDownByEvenNumberFromXtoY(50,0);
    }
    //instead of countDownByEvenNumberFrom50to0
    //now count down by evenNumber from x to y

    public static void countDownByEvenNumberFromXtoY(int x, int y){

        for (int i = x; i >= y ; i--) {

            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    /*
    print1toX
    *create a method that has 1 int parameter called x
    *print from 1 to that number in one line
    *print an empty line after the print
     */
    public static void print1toX(int x){

        for (int i = 0; i <= x ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
