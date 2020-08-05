package day38;

import java.util.*;

public class ReversingList {

    public static void main(String[] args) {

        List <Integer>nums = new ArrayList<>(Arrays.asList(200,100,700,400,500));

        System.out.println("nums before reversing = " + nums);
       // 200,100,700,400,500
        //after reversing
        //500,400,700,100,200
        Collections.reverse(nums);
        System.out.println("nums after reversing = " + nums);
       //after sorting in reverse order line 15
        //700,500,400,200,100
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println("nums after sorting reverse order = " + nums);
    }
}
