package day12;

import java.util.Scanner;

public class CarShopping2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String carBrand = scan.next();  // corolla or tesla
        int carPrice = scan.nextInt(); //30000
        int budget = scan.nextInt();  //40000

        if (carBrand.equals("Corolla") )
        {
            System.out.println("CAR Corolla ACQUIRED!!!");
        }

        else if (carBrand.equals("Tesla") && carPrice<=budget){

            System.out.println("CAR Tesla ACQUIRED!!!");
        }

        else {
            System.out.println("NOT WHAT I AM LOOKING FOR!!!");
        }
    }
}
