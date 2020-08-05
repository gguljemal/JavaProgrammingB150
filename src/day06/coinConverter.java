package day06;

public class coinConverter {
    public static void main(String[] args) {

       /*you have 2 Dollar
        *how many quarter you can get 25c
        *how many dime you can get 10c
        * how many nickel you can get 5c
        * how many penny you can get
        */

       int cent = 200;

       //you have purchase candle for 74 cent,
        //what would be your remainder

        cent-=74;//126
        int quarter=cent/25;
        int penny = cent%25;

        System.out.println(quarter);
        System.out.println(penny);

        int dime=cent/10;
        int penny2=cent%10;
        System.out.println(dime);
        System.out.println(penny2);








    }
}
