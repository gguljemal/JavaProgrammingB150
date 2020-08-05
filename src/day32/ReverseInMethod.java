package day32;

public class ReverseInMethod {

    public static void main(String[] args) {

        reversePrintMyOwnName();

        printStringWithDashInBetween("Guljemal");
        printStringWithDashInBetween("Bahar");


    }

    //reverse
    //create a method tha has no parameter
    //and print your name in reversed name

    public static void reversePrintMyOwnName(){

        String name = "Guljemal";

        for (int i = name.length()-1 ; i >= 0; i--) {

            System.out.print(  name.charAt(i)  );
        }
        System.out.println();
    }

    //print each and every character of a String with dash in between
    //excluding the last one Akbar---->>A-k-b-a-r

    public static void printStringWithDashInBetween(String name){

        for (int i = 0; i < name.length() ; i++) {

            System.out.print(name.charAt(i) );

            if(i!=name.length()-1) {

                System.out.print("-");
            }
        }
        System.out.println();
    }
}
