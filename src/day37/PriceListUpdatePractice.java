package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdatePractice {

    public static void main(String[] args) {

//        ArrayList <String> teamMate = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        //change the third price to 10$
        priceList.set(2, 10.0);
        System.out.println("priceList = " + priceList);

        //add 4 dollar to first price
        priceList.set( 0 , priceList.get(0)+4 );
        System.out.println("priceList = " + priceList);

        //change last price to sum of first and second
        double sumOf1And2Items = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1,sumOf1And2Items);
        System.out.println("priceList = " + priceList);

        //give 40% off to second price
        priceList.set(1,priceList.get(1)*0.6 );
        System.out.println("priceList = " + priceList);

        //double the value of each an every price in this list
        for (int i = 0; i < priceList.size() ; i++) {

            priceList.set(i, priceList.get(i)*2 );
        }
        System.out.println("priceList = " + priceList);

    //cut the price into half if the price is more than 20$

        for (int i = 0; i < priceList.size(); i++) {

            if ( priceList.get(i) >= 20 ){

                priceList.set(i, priceList.get(i)/2);
            }
        }
        System.out.println("priceList = " + priceList);

        //swap the first value with the last value
        double temp1 = priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp1);

        System.out.println("priceList = " + priceList);

    }
}
