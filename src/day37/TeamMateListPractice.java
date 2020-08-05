package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    public static void main(String[] args) {

//    create ArrayList of String and store
 //   teamMate

//      ArrayList <String> teamMate = new ArrayList<>();
        List <String> teamMate = new ArrayList<>();

        teamMate.add("Akbar");
        teamMate.add("Kuzzat");
        teamMate.add("Murodil");
        teamMate.add("Maruf");
        teamMate.add("Vasyl");
        teamMate.add("Muhtar");
        teamMate.add("Asiya");
        teamMate.add("Mike");

        System.out.println("teamMate = " + teamMate);

        //    print first and last item

        System.out.println("First item = " + teamMate.get(0));

        System.out.println("Last item = " + teamMate.get(teamMate.size()-1));

        //    print one by one

        for (int i = 0; i < teamMate.size() ; i++) {

            System.out.println(teamMate.get(i));

        }
            //    print reverse

            for (int j = teamMate.size()-1; j >0 ; j--) {
                System.out.println(teamMate.get(j));
            }

        //    print 2 at a time

        for (int i = 0; i < teamMate.size()-1; i++) {

            System.out.println( teamMate.get(i) + ", " + teamMate.get(i+1) );
        }
        //    print 2 at a time without repeating

        for (int i = 0; i < teamMate.size()-1; i+=2 ) {

            System.out.println( teamMate.get(i) + ", " + teamMate.get(i+1) );
        }

        //    concat everyone in one string separated by -

        String all = "";
        for (int i = 0; i < teamMate.size() ; i++) {

            all += teamMate.get(i)+"-";
        }
        System.out.println("all = " + all);
        
        //TURN LIST INTO A STRING AND STORE IT
        
        String lstToString = teamMate.toString();
        System.out.println("lstToString after replacing = " + lstToString.replace(", ","-")
        .replace("[","").replace("]",""));


    }
}
