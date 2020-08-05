package day29;

public class StringArrayPractice2 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        //hide this hero identity
        //String heroX="Superman-************";

        //given a String with hero code and name separated by -
        //turn this String into hero code and * with same length as hero name

        String name [] = hero1.split("-");
        String arr1 = name [0];
        String arr2 = name [1];

        String star = "";

        for (int i = 0; i <=arr2.length()-1 ; i++) {
            star+="*";
        }
        System.out.println("star = " + star);

        System.out.println("hero1 = "+hero1);
        String heroX = hero1.replace(arr2,star);
        System.out.println("heroX = " + heroX);


    }
}
