package day27;

public class MinNumMultiArray {

    public static void main(String[] args) {

        int numbers [] [] =  { {12,13,54,60} , {45,74,23} };

        int minNum = numbers[0][0];

        for (int eachBracket [] : numbers) {
            for (int number : eachBracket) {
                if (minNum>number){
                    minNum=number;
                }
            }
        }
        System.out.println(minNum);

    }
}
