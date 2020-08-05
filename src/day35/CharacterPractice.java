package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        //character class has lots of static methods
        //to perform actions on char values
        //isDigit, isLetter, isLetterOrDigit, IsUpperCase , IsLowerCase
        //toUpperCase, toLowerCase

        System.out.println("IS DIGIT METHOD PRACTICE");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        //GET THE NUMBER OUT OF THIS STRING
        //AND STORE IT INTO INTEGER VARIABLE X
        String numsStr = "";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){

                System.out.print("str.CharAt("+i+") = " + str.charAt(i));

                numsStr += str.charAt(i);
            }
        }
        System.out.println("numsStr = " + numsStr);
        Integer num = Integer.valueOf(numsStr);
        System.out.println("num = " + num);
    }
}
