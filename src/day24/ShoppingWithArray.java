package day24;

public class ShoppingWithArray {

    public static void main(String[] args) {

     /*
     Create a String array of 6 items to store grocery item
     {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"}

     create a float array of 6 float values to store prices
     {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f}
     assume that order of grocery items match the prices in same order.
      */

//     String fruit [] = new String[6];

        String fruits [] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        for (String fruit : fruits) {

            System.out.print("fruit = " + fruit);

            if (! fruit.equalsIgnoreCase(fruits[fruits.length-1])){

                System.out.print(", ");
            }


        }
        float price[]= {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
    }
}
