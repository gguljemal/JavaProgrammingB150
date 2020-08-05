package day24;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int scores [] = {99,44,66,23,19,55};

        System.out.println(   Arrays.toString(scores)  );
//      for sorting an array in ascending order
//      sort  -----> Arrays.sort(arrayhere)
        System.out.println("original first item value: "+ scores[0]);

        Arrays.sort(scores);
//      After sorting Arrays ORIGINAL array will gone
//      and you CANNOT get it back!!!

        System.out.println( Arrays.toString(scores) );
//      first item value
        System.out.println("first item value: "+ scores[0]);

        System.out.println("  ---------- character sorting -----------------");

        char names [] = {'G', ' ', 'd', 'Z', '9', 'I'};

        System.out.println("Before sorting: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("After sorting: " + Arrays.toString(names));

        //the low to high order for character is decided by its ascii table value
        //special characters comes first, number, uppercase then lowercase

        System.out.println("--------------String sorting----------------");

 //     Only first character matter when sorting a string array

        String superHeros [] = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println("Before SORTING String"+Arrays.toString(superHeros));

        Arrays.sort(superHeros);

        System.out.println(  "After SORTING String"+Arrays.toString(superHeros)  );

        System.out.println("----boolean sorting-----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY---");

        boolean onOff [] = {true,false,false,true,true};
        System.out.println(Arrays.toString(onOff));


    }
}
