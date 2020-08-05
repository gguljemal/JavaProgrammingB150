package officeHours;

public class Practice_12_11 {

    public static void main(String[] args) {

        /*  {"apple", "banana","grape","strawberry","blueberry","kiwi"}

        1-loop through each grocery items and print them in one line
         1.1 print each item at odd index
         1.2 print all items in reverse order
         1.3 find out the index location of strawberry
         1.4 find out the count of groceries that contains berry in the name
         1.5 print out all the character counts of the grocery items
         1.6 print out only those items with even character count
         1.7 print out only those items end with letter e
         1.8 print out only last 3 characters of all items
         1.9 create String variable called allItems and store all the items inside array
             separated by coma.
         */


//      1.7 print out only those items end with letter e

        String fruits [] = {"apple", "banana","grape","strawberry","blueberry","kiwi"};

        for (String each : fruits) {

            if (each.endsWith("e")){
                System.out.println(each);
            }
        }
//        1.8 print out only last 3 characters of all items

        for (String eachFruit : fruits) {

            String last3 = eachFruit.substring(eachFruit.length()-3);

            System.out.println(last3);
        }

/*
         {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f}

         2-loop through each grocery items and print them in one line

         2.1 print each prices even index
         2.2 print only prices less that 3 dollars
         2.3 print the sum of all the prices and get average
         2.4 print only the second half of prices (last 3)
         2.5 print the sum of the middle two prices
         2.6 print only prices more than average prices
         2.7 find out max price and print out max price and index of max price
         2.8 find out the minimum price and index of minimum price
         2.9 find out second max price and index (challenging)
 */

         float prices [] = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

         float max = prices [0];
        for (float each : prices) {

            if (each > max) {
                max = each;
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i < prices.length ; i++) {

            if (prices[i]==max){
                System.out.println("max prices index is " + i);
            }
        }

  //    2.9 find out second max price and index (challenging)
        float max2 = prices [1];

        for (float each : prices) {

            if (each > max2 && each!=max) {
                max2 = each;
            }
        }
        System.out.println("max2 = " + max2);

        for (int i = 0; i < prices.length; i++) {

            if (prices[i]==max2){
                System.out.println("second max prices index is "+i);
            }
        }


    }
}
