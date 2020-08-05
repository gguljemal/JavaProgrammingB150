package day26;

import java.util.Arrays;

public class CountItemInArray {

    public static void main(String[] args) {

      String movies [] = {"Iron man", "Captain America","Spiderman","Black Panther", "Hulk",
                              "Black Widow", "Black Panther", "Hulk","Wanda","Captain Marvel",
                            "Captain America","Spiderman","Black Panther", "Hulk","Wanda",
                            "Captain Marvel"};

        System.out.println("movies = " + Arrays.toString(movies));

        int sizeArray = movies.length;
        System.out.println("Length of Array: " + sizeArray);

        String itemToSearch =" Iron man" ;
        int countOfItem = 0;

        for (String movie : movies) {

            if (movie.equalsIgnoreCase("Hulk")){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);

      // count the hero with the name contains black in case sensitive manner
      int countBlack = 0;
        for (String movie : movies) {
            if (movie.toLowerCase().contains("black")){
                countBlack++;
            }
        }
        System.out.println("countBlack = " + countBlack);

    }
}
