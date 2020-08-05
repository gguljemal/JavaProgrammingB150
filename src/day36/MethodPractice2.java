package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        long[]num = {6L,11L,44L,32L,65L};
        System.out.println("before swamp num = " + Arrays.toString(num));

        swampFirstAndLastValue(num);
        System.out.println("After swamp num = " + Arrays.toString(num));


    }
    /**
     * swam 1 and last value of long array
     * @param nums long array
     */
    public static void swampFirstAndLastValue(long [] nums){

        long temp = nums [0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
    }
}
