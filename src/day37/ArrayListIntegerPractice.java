package day37;

import java.util.ArrayList;

public class ArrayListIntegerPractice {

    public static void main(String[] args) {

        ArrayList <Integer> lst2 = new ArrayList<>();

        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);

        //insert 100 right after 34: we do not know where is 34

        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("lst2 = " + lst2);

//    add five 100 in front of 44
//
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//        System.out.println("lst2 = " + lst2);
//        OR we can use loop

        for (int i = 1; i <= 5 ; i++) {

            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);



    }
}
