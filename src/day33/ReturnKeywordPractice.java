package day33;

public class ReturnKeywordPractice {

    public static void main(String[] args) {


        System.out.println( calculateAgeFromBirthYear(198) );
    }
    /*
    *calculateAndReturnAge
    * this method will calculate th age according to the birth year
    * and return the age
    * @param birthYear the number that represent birth year
    * @return the calculated value from the age
    *             if the birth year is not within 1900-2020 return 0
     */

    public static int calculateAgeFromBirthYear (int birthYear){

        if (birthYear <= 1900 || birthYear >= 2020){
            return 0;
        }
        return 2019-birthYear;
    }
}
