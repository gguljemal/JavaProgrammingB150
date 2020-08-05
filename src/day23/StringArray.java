package day23;

public class StringArray {

    public static void main(String[] args) {

      String [] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};

        System.out.println("How many program we have: " + shows.length);

        for( int x = 0; x <shows.length; x++ ){

            String currentShow = shows[x];
            System.out.println(currentShow + " has character count " + currentShow.length());
        }
    }
}
