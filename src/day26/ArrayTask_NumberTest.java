package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        //given an int array
        //write a program to test all the element in an int array more than 100 or not

        int scores [] = {156,101,76,187,87,110};

        //create a variable called finalResult to store
        //your result of checking if every number in this array is more than 100 then
        // make it yes, if not make it no
        String finalResult = "";

        //LOGIC 1:
        //take each item check if it is less than 100, count.if count is more than 0, answer is NO

        int cntLessThan100 = 0;

        for (int number : scores){

            if (number<=100){
                System.out.println("number = " + number);
                ++cntLessThan100;
            }
        }
         System.out.println("count = " + cntLessThan100);

        if (cntLessThan100>0){
            finalResult="NO";
        }else {finalResult="YES";}
        System.out.println("finalResult = " + finalResult);


    }

}
