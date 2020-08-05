package day16;

public class IndexOf2Parameters {

    public static void main(String[] args) {

        //             012345678901234567890123456789012
        String name = "I love Java I love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 7));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 9));
        System.out.println(name.indexOf("Java", 19));
        System.out.println(name.indexOf("Java", 20));

        //location of first java in this case 7
        int firstJavaLocation=name.indexOf("Java");

        int startingPointToSearchSecondJava =firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("Second Java Location= "+secondJavaLocation);

        //               012345678901234567890123456789012
        //String name = "I love Java I love Java Java Java";

        int firstSpaceLocation = name.indexOf(" ");
        System.out.println(firstSpaceLocation);
        int secondSpace = name.indexOf(" ",firstSpaceLocation+1);
        System.out.println(secondSpace);

        System.out.println("Second word in this sentences is: "+name.substring(firstSpaceLocation+1,secondSpace));
    }
}