package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class ArrayListStringPractice {

    public static void main(String[] args) {

        ArrayList<String> productLst =
                new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71", "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16", "MacbooPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68", "Beats HeadPhones,349.99,15.12",
                        "Mouse,79.99,8.98", "Charger,39.99,4.56", "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25", "TV,2199,89.49", "Apple Watch,559,21.18"));

        System.out.println("productLst = " + productLst);
        System.out.println("productLst element item = " + productLst.size());

        //Task 1: print only items name

//        String itemDetails = "iPhone 6s,449,18.71";
//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + itemDetails.split(",")[1]);
//        System.out.println("item monthly = " + itemDetails.split(",")[2]);

        for (String eachItem : productLst) {
            System.out.println("each item name = " + eachItem.split(",")[0]);
        }
        //   Task 2 : print all the prices more than 500
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println(" price more 500 = " + price);
            }
        }
        //  Task 3 : print average price
        double sum = 0;
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }
        System.out.println("average price of products  = " + sum / productLst.size());

        // Task 4: print all the items name that has less than 20$ monthly payment
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly < 20) {
                System.out.println("name of product that is monthly less than 20$ = " + name);
            }
        }
        // Task 5: Print the monthly payments of all the iPhones no matter what model

        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println("iPhone price monthly = " + monthly);
            }
        }
        // Task 6: Print all information about most expensive item.
//    double maxPrice = 0;
//    String maxPriceItem = "";
//        for (String eachProduct : productLst) {
//            double price = Double.parseDouble(eachProduct.split(",")[1]);
//            if (price > maxPrice ){
//                maxPrice = price;
//                maxPriceItem = eachProduct;
//            }
//        }
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("maxPriceItem " + maxPriceItem);
//        System.out.println("maxPriceItem is at index: " + productLst.indexOf(maxPriceItem) );


        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {

            double price = Double.parseDouble(productLst.get(i).split(",")[1]);

            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("expensive item detail = " + productLst.get(maxPriceIndex));

        // Task 7: Update Dyson price to 80% off
        int indexDyson = 0;
        for (int i = 0; i < productLst.size(); i++) {
            if (productLst.get(i).contains("Dyson")) {
                indexDyson = i;
            }
        }
        System.out.println("indexDyson = " + indexDyson);
        String dysonInfo = productLst.get(indexDyson);
        String name = dysonInfo.split(",")[0];
        double priceDyson = Double.parseDouble(dysonInfo.split(",")[1]);
        double monthlyDyson = Double.parseDouble(dysonInfo.split(",")[2]);

        dysonInfo = name + "," + priceDyson * 02 + "," + monthlyDyson * 0.2;
        System.out.println("dysonInfo = " + dysonInfo);
        productLst.set(indexDyson, dysonInfo);
        System.out.println("productLst = " + productLst);
        // (Monthly payment 24 month should also be calculated accordingly)

        // Task 8: Count the items price more than average price

        double sumOfPrice = 0;
        int count = 0;
        double average = sum / 12;

        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > average) {
                ++count;
            }
        }
        System.out.println("average price of products  = " + sum / productLst.size());
        System.out.println("all items with more than average price = " + count);

        // Task 9 : Remove all the items with prices more than average price

        for (int i = 0; i < productLst.size(); i++) {

            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average) {
                productLst.remove(i);
                i--;
            }
        }
        System.out.println("productLst count after removing  = " + productLst.size());

        // create 3 more ArrayList objects to separately store
        //item names(String), prices(Double), monthlyPayments(Double) :

        ArrayList<String> itemNames = new ArrayList<>();

        ArrayList<Double> prices = new ArrayList<>();

        ArrayList<Double> monthlyPayments = new ArrayList<>();

//        String item1Name = "iPhone 6s,449,18.71";

        for(String eachProduct : productLst){

        itemNames.add(eachProduct.split(",")[0]);

        double priceItem1 = Double.parseDouble(eachProduct.split(",")[1]);
        prices.add(priceItem1);

        double monthlyItem1 = Double.parseDouble(eachProduct.split(",")[2]);
        monthlyPayments.add(monthlyItem1);
    }
        System.out.println("itemNames = " + itemNames);
        System.out.println("priceItem1 = " + prices);
        System.out.println("monthlyItem1 = " + monthlyPayments);

    }
}
