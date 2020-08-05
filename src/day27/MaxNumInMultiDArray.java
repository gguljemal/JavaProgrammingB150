package day27;

public class MaxNumInMultiDArray {

    public static void main(String[] args) {

       int numbers [] [] =  { {12,13,54,60} , {45,74,23} };
       
       int max =numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {

                if (max<numbers[i][j]){
                    max=numbers[i][j];
                }
            }
        }System.out.println("max = " + max);

        System.out.println("-----------ForEach loop------------");

        int max2 = numbers[0][0];
        for (int eachArray [] : numbers) {

            for (int number : eachArray) {

                 if (max2<number){
                     max2=number;
                 }
            }
        }
        System.out.println("max number: "+max2);
    }
}
