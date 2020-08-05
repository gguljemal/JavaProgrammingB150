package day43;

public class StarbucksUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        printCoffeeInfo( new Coffee("Intensito",10) );

        String s1 = new String ("Hello");
        printStringInfo( s1 );
        printStringInfo("ABC");

    }

    /**
     * a static method to print out first and last character of a String
     * @param str
     */

    public static void  printStringInfo (String str){
        System.out.println( "first character is " + str.charAt(0) );
        System.out.println( "last character is " + str.charAt(str.length()-1) );
    }
    // Create a static method to accept a coffee object and print it is information
    // like this : This coffee is : name , price, caffeine level

    /**
     * a static method to accept a coffee object and print its information
     * this coffee : name, price and caffeine level
     * @param co the object caller pass
     */
    public static void printCoffeeInfo (Coffee co){

        System.out.println( "This coffee is : " + co.getType() );
        System.out.println( "Price is " + co.getPrice() );
        System.out.println( "Caffeine Level is : " + co.getCaffeineLevel() );
    }
}
