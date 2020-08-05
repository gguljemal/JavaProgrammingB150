package day36;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        //Its expecting 2 Integer object
        //and we used Integer valueOf to provide 2 Integer Objects
        sumAndPrint(Integer.valueOf(23), Integer.valueOf(12));

        //Its expecting 2 Integer object
        //and we used new keyword to provide 2 Integer Objects
        sumAndPrint(new Integer(12), new Integer(10));
        Integer i1 = 12;
        Integer i2 = 10;
        sumAndPrint(i1,i2);

        sumAndPrint(10,33);

        System.out.println("------2nd method------------");
        printDoubledValue(6);
        printDoubledValue(new Integer(10));

    }

    /**
     * this method add 2 Integer numbers and print
     * @param num1
     * @param num2
     */

    public static void sumAndPrint (Integer num1, Integer num2){

        System.out.println(num1+num2);
    }

    /**
     * this method will print the doubled value of what user passed
     * @param x
     */
    public static void printDoubledValue(int x){

        System.out.println("after doubling x = " + (x*2) );
    }
}
