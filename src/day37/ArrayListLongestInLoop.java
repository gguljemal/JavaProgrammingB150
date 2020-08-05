package day37;

import java.util.ArrayList;

public class ArrayListLongestInLoop {

    public static void main(String[] args) {

        ArrayList < String > nameList = new ArrayList<>();

        nameList.add("Ahmetjan");
        nameList.add("Bahariim");
        nameList.add("Ilyasjik");
        nameList.add("Hemme");
        nameList.add("Maya");
        nameList.add("Jemal");

        System.out.println("nameList = " + nameList);

        //find longest name
        //assume first one is longest one and compare with the rest
        String longest = nameList.get(0);

        for (int i = 0; i < nameList.size() ; i++) {
//            > will give you first longest name if you have more than one
//            >= will give you last longest name if you have more than one
            if (nameList.get(i).length() >= longest.length()){
                longest = nameList.get(i);
            }
        }
        System.out.println("longest = " + longest);
/*
    how do I get the concatenation of all longest words if there are more than one
    first find out the longest word, and get the character count
    then loop through each names
    and check whether character count equal to longest word character count
 */

        for (int i = 0; i < nameList.size() ; i++) {

            if (nameList.get(i).length() == longest.length()){
                System.out.println("longest nameList = " + nameList.get(i));
            }
        }

        //FOR EACH LOOP

        for (String eachName : nameList) {
            System.out.println("eachName = " + eachName);
        }
    }
}
