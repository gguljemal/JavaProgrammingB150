package day36;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

      //create a ArrayList object of long and assign it to a variable

        ArrayList <Long> lst = new ArrayList<>();

//  add item, insert an item, read item, update the item, remove the item, check the location...

      lst.add(12L);
      lst.add(100L);
      lst.add(25L);
      lst.add(200L);

        System.out.println("lst = " + lst);

        //to know how many items inside

        System.out.println(    "Counting items using lst.size() = " + lst.size()  );

        //Getting items inside ArrayList object
        System.out.println("1st item in lst = " + lst.get(0));

 //       TASK : Get the sum of above arraylist items

        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {

            sum += lst.get(i);
        }
        System.out.println("sum = " + sum);

        //get the max of above arraylist items

        long max = lst.get(0);

        for (int i = 0; i < lst.size(); i++) {

            if (lst.get(i) > max){
                max = lst.get(i);
            }
        }
        System.out.println("max = " + max);
    }
}
