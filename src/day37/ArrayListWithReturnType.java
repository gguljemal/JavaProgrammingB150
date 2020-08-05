package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithReturnType {

    public static void main(String[] args) {

        System.out.println(getListFrom1TillFinalNumber(5));

        List <Integer> myList = getListFrom1TillFinalNumber(7);
        System.out.println("myList = " + myList);
    }

    /*
    create a method that accept a finalNumber as int
    return an ArrayList of Integer containing numbers
    starting from 1 till finalNumber
     */

    /**
     * this method will return a List of Integer that containing numbers
     * starting from 1 till finalNumber
     * @param finalNumber this is the last item of the list
     * @return List<Integer> that contain 1 till final numbers increased  by 1
     */
    public static List<Integer> getListFrom1TillFinalNumber(int finalNumber){

       List <Integer> nums = new ArrayList<>();

        for (int i = 1; i <= finalNumber; i++) {
            nums.add(i);
        }
        return nums;
    }
}
