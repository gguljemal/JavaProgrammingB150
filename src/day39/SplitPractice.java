package day39;

public class SplitPractice {

    public static void main(String[] args) {

//        String itemDetails = "iPhone 6s,449,18.71";
//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + itemDetails.split(",")[1]);
//        System.out.println("item monthly = " + itemDetails.split(",")[2]);
//    OR CAN DO BELOW!!!

        String itemDetails = "iPhone 6s,449,18.71";
        String splitItems [] = itemDetails.split(",");

        String name = splitItems[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(splitItems[1] ) ;
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(splitItems[2]);
        System.out.println("monthly = " + monthly);




    }
}
