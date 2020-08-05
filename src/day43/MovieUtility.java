package day43;

import day42.Movie;

public class MovieUtility {

    public static void main(String[] args) {

        Movie m1 = new Movie("Joker",2.2,"Drama");
        Movie m2 = new Movie("Frozen2",1.5,"Family");
        Movie m3 = new Movie("Happiness",2.0,"Drama");

        //expected to print the movie Joker is 2.2 hour long and it genre is Drama
        printMovieInformation(m1);

    }

    /*
    A void method that accept any movie object
    and print out its information in below format
    The movie <name> is <length> hour long and it genre is <type>
    @param o1 the movie object to get information from
     */
    public static void printMovieInformation ( Movie o1){

        System.out.print( "The movie name " + o1.getName() );
        System.out.print( " is " + o1.getLength() + " hour long ");
        System.out.println( " and it genre is " + o1.getType() );
    }
}
