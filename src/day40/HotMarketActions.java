package day40;

import java.util.ArrayList;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.location = "Austin";
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.company = "Google";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.location = "Boston";
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.location = "Vancouver";
        o3.displayInformation();

        Offer o4 = new Offer();
        //if we do not assign values for instance filed/variable
        //we get default value
        o4.displayInformation();

//     creating ArrayList of Offer to store multiple offer objects
        ArrayList < Offer > myOffer = new ArrayList<>();
        myOffer.add(o1);
        myOffer.add(o2);
        myOffer.add(o3);
        myOffer.add(o4);

        for (Offer eachOffer : myOffer) {

            eachOffer.displayInformation();
        }

        for (int i = 0; i < myOffer.size() ; i++) {
            //myOffer.get(i).displayInformation();
            //or we can store it

            Offer each = myOffer.get(i);
            each.displayInformation();

            //can use one shot version
            myOffer.get(i).displayInformation();
        }



    }
}
