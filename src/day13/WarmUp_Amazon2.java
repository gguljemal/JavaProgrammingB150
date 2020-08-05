package day13;

public class WarmUp_Amazon2 {

    public static void main(String[] args) {

        /*
        *create a boolean store the result of doYouWantToShop
        * if yes, do you want to go to Store or do you wanna shop online
        * if no, print Good job stay home coding!!!
         */

        boolean doYouWantToShop = true;
        String preference="";

        if (doYouWantToShop){
            if (preference.equals("Store"))
            System.out.println("Going to store for shopping");
            else {System.out.println("Going to online for shopping");}
        }
        else {System.out.println("Good job stay home coding!!!");}

    }
}
