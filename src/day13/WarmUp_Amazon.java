package day13;

public class WarmUp_Amazon {

    public static void main(String[] args) {

        /*
        *Amazon has 2 type of user one is Prime member amd another is regular member
        * prime member get free shipping in all purchase no matter the amount
        * regular member user get free shipping only if their purchase is more than 25$
        * otherwise they get 5$ shipping fee
       */

        String memberType = "Prime member";
        double amount = 15.99d;
        int shippingFee= 0;

        if (memberType.equalsIgnoreCase("PRIME MEMBER")){

            System.out.println("YOU GET 1 DAY FREE SHIPPING!!!");
            System.out.println("your final price is "+amount);
        }
        //else if(! memberType.equalsIgnoreCase("PRIME MEMBER")  && amount>25)
        else if(25<amount) {

            System.out.println("NOT A PRIME MEMBER BUT YOU ORDER IS MORE THAN 25 ");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT" + amount);
        }
        else {
            System.out.println("do wanna sign up for prime membership?");
            shippingFee=5;
            amount=amount+5;
            System.out.println("Your final amount is "+amount);
        }
    }
}