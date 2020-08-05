package day37;

import java.util.ArrayList;

public class ArrayListRemoveItemPractice {

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);

//        lst.remove(3);
//        System.out.println("lst after removing index item 3 = " + lst);
        lst.remove(2);
        System.out.println("lst = " + lst);
//want to remove an object not index
        //lst.remove(new Integer(2)); or
        lst.remove(  Integer.valueOf(2) );
        System.out.println("lst = " + lst);

    }
}
