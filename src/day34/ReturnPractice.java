package day34;

public class ReturnPractice {

    public static void main(String[] args) {
        //what is return keyword is used

        printMin4CharLengthName("Jon");
        printMin4CharLengthName("Java Shark");
    }
    public static void printMin4CharLengthName(String name){
//  if the name has less than 4 chars, get out of the method

        if (name.length()<4){
            System.out.println("Invalid name!");
            return; // return is used to get out of the method early
        }
        System.out.println(name);

    }
}
