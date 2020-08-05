package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {

        List <String> superHero = new ArrayList<>();
        superHero.add("Superman");
        superHero.add("Batman");
        superHero.add("Cyborg");
        superHero.add("Flash");
        superHero.add("Aquaman");
        superHero.add("Wonder Woman");

        System.out.println("superHero = " + superHero);

        //does this contains an item with exact value of man
        System.out.println("superHeroes.contain(\"man\") = " + superHero.contains("man"));
        //====>>result false  no man within values in list so go with 1by 1 with each item

        //remove the heroes that does not have man in the name
        for (int i = 0; i < superHero.size() ; i++) {

            if ( !superHero.get(i).contains("man")){
                superHero.remove(superHero.get(i));
                i--;
            }
        }
        System.out.println("superHero = " + superHero);

        List <String> superHeroCopy = new ArrayList<>(superHero);
        System.out.println("superHeroCopy = " + superHeroCopy);

        //this will create a unmodifiable list!!!
        List <String> topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);

        List<String> topicsCopy = new ArrayList<>(topics);





    }
}
