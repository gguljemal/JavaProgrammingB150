package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L);
        lst.add(100L);
        lst.add(25L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // I want to insert 125 between 100L and 150L, basically 2nd and 3rd items

        lst.add(2,125L);
        System.out.println("lst = " + lst);
        System.out.println("item in index 3 is (lst.get(3) ) " + lst.get(3));

        //updating value at certain index : set method
        lst.set(3,195L);
        System.out.println("NEW VALUE FOR lst.get(3) = " + lst.get(3));

        //removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);

        //removing item by its object
        lst.remove(2);
        System.out.println("lst after removing item in index 2 = " + lst);

        //looking for location of certain item
        System.out.println("Location of 100L is using lst.indexOf(100L) = " +
                             lst.indexOf(100L));
        System.out.println("Location of 100L is using lst.indexOf(100L) = " +
                lst.indexOf(125L));

        //check whether a list is empty or not
        System.out.println("lst.size()>0 = " + (lst.size() > 0)  );
        System.out.println(" lst.isEmpty() = " + lst.isEmpty()  );

        //how do I delete everything inside my ArrayList
       // ** lst.clear();

        // check whether we have certain item or not

        System.out.println(" lst.contains(100L) = " + lst.contains(100L));
        System.out.println("lst.contains(10L) = " + lst.contains(10L));

        // how do I check whether a list contains an item without using containMethod
        //use indexOf method if it returns -1, it means we do not have it
        System.out.println("do I have 10L = " + (lst.indexOf(10L)!=-1) );


    }
}
