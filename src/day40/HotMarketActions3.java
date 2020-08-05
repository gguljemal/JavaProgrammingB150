package day40;

public class HotMarketActions3 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.isFullTime = false;
        o1.salary = 140000;
        o1.location = "Austin";

        o1.displayInformation();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();

        o1.changeAllInfo("Micro","NJ",30000,true);
//     or o1.changeAllInfo("Micro","NJ",30000,true);
 //     o1.displayInformation();

        //if this guy earn mor ethan 100K
        // move him to Atlanta
        System.out.println( "Is it 100K offer? " + o1.offerIs100()  );
//        boolean result = o1.offerIs100();
//        if (result==true){
//            o1.changeLocation("Atlanta");
//        }
//        o1.displayInformation();

        if (o1.offerIs100()){
            o1.changeLocation("Atlanta");
       }
     o1.displayInformation();

        System.out.println(o1.toString());





    }
}
