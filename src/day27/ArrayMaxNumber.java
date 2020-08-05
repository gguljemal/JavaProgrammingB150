package day27;

public class ArrayMaxNumber {

    public static void main(String[] args) {

    // write a program that returns the max number from an array
    //NO SORTING METHOD

    int numbers [] = {100,630,223,998,456,321};
    int maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (maxNum<numbers[i]){
                maxNum=numbers[i];
            }
        }
        System.out.println("maxNum = " + maxNum);

        System.out.println("--------Second Max Number--------");

        int secondMax = numbers[0];
        for (int x = 0; x < numbers.length ; x++) {
            if (maxNum==numbers[x]){
                continue;
            }
            if (secondMax<numbers[x]){
                secondMax=numbers[x];
            }
        }
        System.out.println("secondMax = " + secondMax);


    }
}
