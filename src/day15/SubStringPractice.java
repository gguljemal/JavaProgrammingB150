package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        //getting the part of the String out of another String
               //       0123456789012345
        String movie = "Lord of the Ring";

        //I want to get the word <of> String from this movie
        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = "+wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe "+wordThe);

        /*
        get from the second word till last word
                        0123456789012345
        String movie = "Lord of The Ring" ;
         */

        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length();
        System.out.println("second word till last: "
                +movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,movie.length());
        System.out.println("second Word Till Last = " + secondWordTillLast);

        //                        0123456789012345
        //        String movie = "Lord of The Ring" ;

        String wordLordOf = movie.substring(0,7);
        System.out.println("Word Lord of = "+wordLordOf);

        //reverse lord of the ring --->>ring of the lord

        String reverse = movie.substring(12,movie.length())+" "+movie.substring(5,11)
                +" "+movie.substring(movie.indexOf("L"),4);

        System.out.println(reverse);





    }
}
