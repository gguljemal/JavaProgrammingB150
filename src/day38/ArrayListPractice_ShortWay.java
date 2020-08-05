package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        //create List of 6 double in short way,
        //we will just read them and will not add or remove item

        List <Double> price = Arrays.asList(9.99,5.55,3.76,8.99,0.99,65.36,0.99);
        //cannot add and remove item
        System.out.println("price = " + price);
        int count = 0;

        for (Double eachPrice : price) {

            if(eachPrice>5){
                count++;
            }
        }
        System.out.println("count = " + count);

        List <Double>copyPrice = new ArrayList<>(price);
        //in this form can add and remove items!!!
        System.out.println("copyPrice = " + copyPrice);
        copyPrice.add(199.99);
        copyPrice.remove(0.99);//if there is 2 same number it will remove 1st one always
        System.out.println("copyPrice = " + copyPrice);

        //Create a ArrayList Object in one short with many items so we can add or remove

        ArrayList < Double > oneShotPrice = new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));

        //add 100.99 after 9.99

        oneShotPrice.add(1,100.99);
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice = " + oneShotPrice);
    }
}
