package day26;

public class ArrayReview {

    public static void main(String[] args) {

        int numbers [] = new int[4];
        numbers[0]=10;
        numbers[1]=40;
        numbers[2]=30;
        numbers[3]=7;

        int size = numbers.length;
        int lastIndex = size-1;
        //How do I get last item of an array
        //want to save last item into a variable
        //int lastItem = numbers[3];
        //int lastItem = numbers[lastIndex];
        int lastItem = numbers[numbers.length-1];
        //print third item
        System.out.println(numbers[2]);//30

        //I want to add 1 to the second item value
        numbers[1]=numbers[1]+1;
        System.out.println(numbers[1]);
        //I want to double the second item value
        numbers[1] = numbers[1]*2;
        System.out.println(numbers[1]);
        //want to assign 3rd item value to sum of 1 and 2 item
         numbers[2] = numbers[0]+numbers[1];
        System.out.println(numbers[2]);

    }
}
