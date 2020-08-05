package day26;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {

        int numbers [] = {5,3,21,2,1,13,8};

        int length = numbers.length;
        int lastIndex = length-1;
        int middleIndex = length/2;

        System.out.println(Arrays.toString(numbers));

        //first and last
        System.out.println(numbers[0]+"---"+numbers[lastIndex-0]);
        //second and one before the last
        System.out.println(numbers[1]+"---"+numbers[lastIndex-1]);
        //third and 2 before the last index
        System.out.println(numbers[2]+"---"+numbers[lastIndex-2]);

        System.out.println("----------loop-----------------");

        for (int i = 0; i < middleIndex ; i++) {
            System.out.println(numbers[i] + "---" + numbers[lastIndex-i]);
            int temp = numbers[i];
            numbers[i] = numbers[lastIndex-i];
            numbers[lastIndex-i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
