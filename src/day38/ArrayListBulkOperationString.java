package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperationString {

    public static void main(String[] args) {

        List <String> groceryLst = Arrays.asList("Eggs","Milk","Butter","Apple","Salmon");
        System.out.println("groceries = " + groceryLst);

        ArrayList <String> newList = new ArrayList<>( groceryLst );
        newList.add("Diet coke");
        newList.add("Sugar");
        System.out.println("newList = " + newList);

        //actually I have list of items for you here: Pasta,branzini,asparagus,spinach
        //good news is I already created a List object for you so you can just add them
        // all to your existing list

        List <String> newItemToAdd = Arrays.asList("Pasta","branzini","asparagus","spinach");

        //Adding one list to another list
        //we want to add all items of newList to newLst

       newList.addAll(newItemToAdd);
        System.out.println("newList = " + newList);
    }
}
