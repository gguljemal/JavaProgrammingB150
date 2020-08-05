package day37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        ArrayList < String > nameList = new ArrayList<>();

        nameList.add("Ahmetjan");
        nameList.add("Bahariim");
        nameList.add("Ilyasjik");
        nameList.add("Hemme");

         printAList(nameList);

        System.out.println("longest nameList = " + getLongestElement(nameList) );
    }

 /*
 create a method that accept  a List of String as argument
 same thing as a method that has List of String parameter
 and print out each and every item in the list vertically
 return nothing
  */

    /**
     *this method will print out the content of passed List object
     * @param lst of String
     * @return nothing
     */

 public static void printAList (ArrayList <String> lst){
     for (String each : lst) {
         System.out.println("each = " + each);
     }
 }

    /**
     *
     * @return
     */

 public static String getLongestElement (List<String>nameList){

     String longest = nameList.get(0);

     for (int i = 0; i < nameList.size() ; i++) {
//            > will give you first longest name if you have more than one
//            >= will give you last longest name if you have more than one
         if (nameList.get(i).length() >= longest.length()){
             longest = nameList.get(i);
         }
     }
    return longest;
 }
}
