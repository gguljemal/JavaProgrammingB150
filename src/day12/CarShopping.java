package day12;

import java.util.Scanner;

public class CarShopping {

    public static void main(String[] args) {

        // Buy corolla or tesla (only if it's within the budget)
        Scanner scan = new Scanner(System.in);

        String carBrand = scan.next();  // corolla or tesla
        int carPrice = scan.nextInt(); //30000
        int budget = scan.nextInt();  //40000

        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice<=budget) )
        {
            System.out.println("CAR ACQUIRED!!!");
        }

        else {
            System.out.println("NOT WHAT I AM LOOKING FOR!!!");
        }



    }
}
