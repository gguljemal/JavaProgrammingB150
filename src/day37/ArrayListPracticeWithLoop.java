package day37;

import java.util.ArrayList;

public class ArrayListPracticeWithLoop {

    public static void main(String[] args) {

     /*
     create an ArrayList of Integer and fill it up with 1-100
      */

        ArrayList <Integer> nums = new ArrayList<>();

        for (int number = 1; number <= 100 ; number++) {

            nums.add(number);
        }
        System.out.println("nums = " + nums);

        //change all the odd number value to 0;

        for (int i = 0; i < nums.size(); i+=2) {

 //           System.out.println("Odd Values are at index = " + i);
            nums.set(i,0);
        }
        System.out.println("After setting odd numbers in nums to 0 = " + nums);

        //how to find index of value 20 :
        System.out.println("index of 20: nums.indexOf(20) = " + nums.indexOf(20));//in index 19

        //insert 100 to first index :
        nums.add(0,100);
        System.out.println("nums = " + nums);// after inserting 100 index of 20 is changed to 20
        System.out.println("index of 20: nums.indexOf(20) = " + nums.indexOf(20));

    }
}
