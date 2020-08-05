package day36;

import java.util.Arrays;

public class MethodWithArrayParameter {

    public static void main(String[] args) {

//        int nums [] = {1,5,3,4,7,2};
//        System.out.println("before sort nums = " + Arrays.toString(nums));
//
//        Arrays.sort(nums);
//        System.out.println("after sort nums = " + Arrays.toString(nums));

        int nums [] = {1,5,3,4,7,2};
        System.out.println("before change nums= " + Arrays.toString(nums));

        //when you pass a variable to a method parameter:
        //you are only passing the copy of that variable
        //for primitives--->> the copy hold the value itself
        //changing the value does not change original value that passed

        /*
        for reference type---> the copy hold same address of the object
        changing the value will affect original object
        because both method parameters and passed variable are pointing to same object

        ****THIS IS WHAT WE CALLED PASS-BY-VALUE
        ===>>when you pass a variable to a method parameter:
        you are only passing the copy of that variable
         */

  //    int nums [] = {1,5,3,4,7,2};
        System.out.println("before change nums = "+Arrays.toString(nums));
        changeArray1Item(nums);
        System.out.println("after change nums = "+Arrays.toString(nums));
    }
    /**
     *
     * @param numbers
     */

    public static void changeArray1Item (int [] numbers){

      numbers[0] = 100;
    }
    /* this is what happen when you pass nums to the this method
    public static void changeArray1Item (int [] numbers){

    numbers variables are copying whatever is inside nums
    which is the THE ADDRESS OF ARRAY OBJECT
    so now numbers has same address of the object as nums
    int numbers [] = nums;
    numbers[0] = 100;
     */

}
