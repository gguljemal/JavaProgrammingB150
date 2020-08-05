package day38;

import java.util.*;

public class SortingListObject {

    public static void main(String[] args) {

        List <Integer> nums = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        System.out.println("nums before sort = " + nums);

        //2 ways to sort an ArrayList
        //Use Collections utility class (just like Arrays utility class for array objects)
        Collections.sort(nums);
        System.out.println("nums after sort = " + nums);

        Collections.sort( nums,Comparator.reverseOrder() );
        System.out.println("nums in reverse order = " + nums);

        /*
        List itself also has sort method that accept one Comparator Object
        simple way to get Comparator objects are
             Comparator.naturalOrder()--->low to high order
             Comparator.reverseOrder()--->high to low order
         */

        nums.sort( Comparator.naturalOrder()  );
        System.out.println("nums after sorting = " + nums);

         nums.sort( Comparator.reverseOrder());
        System.out.println("nums after reverse sorting = " + nums);
    }
}
