package day26;

import java.util.Arrays;

public class SwappingValue {

    public static void main(String[] args) {

    String name1 = "Emma";
    String name2 = "Jason";

    //when swap name2 should have Emma, name1 should have Jason
        //name1 = name2;
        //name2 = name1;

        String tempContainer = name1;

        name1 = name2;  // name1 ----> Jason
        name2 = tempContainer;   //name2 -----> Emma

        System.out.println(name1);
        System.out.println(name2);

        System.out.println("-----------------Swapping in Array-----------------");
        //swap the 1 item value with last item value
        int numbers [] = {10,40,30,7};
        int temp = numbers[0];
        numbers[0] = numbers[3];
        numbers[3] = temp;
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        // want to print all same time

        System.out.println(Arrays.toString(numbers));

        int temp2 = numbers[1];
        numbers[1] = numbers [2];
        numbers[2] = temp2;

        System.out.println(Arrays.toString(numbers));
}
}