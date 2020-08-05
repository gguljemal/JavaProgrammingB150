package day30;

import java.util.Arrays;

public class CarInventory2 {

    public static void main(String[] args) {

        String cars [] = { "Acura-NSX",
                "Chevrolet-Corvette",
                "Maybach-57",
                "Ford-GT",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Suzuki-SJ",
                "Audi-S4",
                "Mazda-MX-6",
                "Volkswagen-CC",
                "Acura-TL",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                 "Honda-CR",
                 "Lexus-LS",
                 "Lexus-RX"};

        //find all the car with model has only 2 characters
        //print them out
        //get the count

         int count=0;

        for ( String car : cars) {

            String carSplit [] = car.split("-");

            if (carSplit[1].length()==2){
               count++;
                System.out.println(car);
            }
        }
        System.out.println("Count of the cars with only 2 characters in their model = "+count);


        String brand = "Lexus-LS";
        String brandSplit [] = brand.split("-");
        System.out.println("brandSplitted = "+ Arrays.toString(brandSplit));

    }
}
