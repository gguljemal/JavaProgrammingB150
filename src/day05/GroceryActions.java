package day05;

import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        /*
        Task5:
        *ask user what is the price of tomato and store it
        *how many tomato you want to buy and store it
        *ask user what is the price of potato and store it
        *how many potato you want to buy and store it
        *ask user what is the price of banana and store it
        *how many banana you want to buy and store it

        generate this example output
        you got 3 tomato price is 2.99 and total-->>
        you got 5 potato price is 3.49 and total-->>
        you got 2 banana price is 1.99 and total-->>

        your grand total for this shopping is???
         */
        // task 5:

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of tomato? : ");

        float tomatoPrice = scan.nextFloat();

        System.out.println("How many tomato you want to buy?: ");

        int tomatoToBuy = scan.nextInt();

        //or just ("Your total cost is:"+ (tomatoPrice*tomatoToBuy))
        float tomatoCost = tomatoPrice * tomatoToBuy;

        System.out.println("Your total cost is: " + tomatoCost);


        //potato example
        System.out.println("What is the price of potato? : ");

        float potatoPrice = scan.nextFloat();

        System.out.println("How many potato you want to buy?: ");

        float potatoToBuy = scan.nextFloat();

        System.out.println("Your total cost is: " + (potatoPrice * potatoToBuy));

        //banana example

        System.out.println("What is the price of banana? : ");

        int bananaPrice = scan.nextInt();

        System.out.println("How many banana you want to buy?: ");

        float bananaToBuy = scan.nextFloat();

        float totalCost = bananaPrice*bananaToBuy;

        System.out.println("Your total cost for banana is: " + totalCost);



    }
}
