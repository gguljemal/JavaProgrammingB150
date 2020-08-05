package day33;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {

        System.out.println( convertNumberToDay(3) );
        System.out.println(convertNumberToDay(7) );

        int codes [] = {5,3,11,4,33};

        for (int i = 0; i < codes.length ; i++) {

            String day = convertNumberToDay(codes[i]);
            System.out.println(day);
        }
        System.out.println("------------------------");

        for (int code : codes){

            System.out.println(convertNumberToDay(code));
        }
    }
    /*convertNumberToDay
    *this method will take number from 1-7
    * and convert that to actual day on word
    * @param int dayCode to represent day in number
    * @return the day in word in English a String
    *          if the number is valid
    *          if the number is not 1-7 return INVALID DAY!
     */
    public static String convertNumberToDay (int day){


        switch (day){
                       case 1:
                       //return "Monday"
                       System.out.println("Monday");
                       break;
                       case 2:
                       //return "Tuesday"
                       System.out.println("Tuesday");
                       break;
                       case 3:
                       //return "Wednesday"
                       System.out.println("Wednesday");
                       break;
                   case 4:
                       //return "Thursday"
                       System.out.println("Thursday");
                       break;
                   case 5:
                       //return "Friday"
                       System.out.println("Friday");
                       break;
                   case 6:
                       //return "Saturday"
                       System.out.println("Saturday");
                       break;
                   case 7:
                       //return "Sunday"
                       System.out.println("Sunday");
                       break;
                   default:
                       System.out.println("INVALID DAY!");
               }

            return "";
}
          public static String Way2ToConvertNumberToDay(int dayCode){

               String days = "";

               String week [] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

               if (dayCode>0 & dayCode<=7){
                   days = week[dayCode-1];
               }else {
                   days="INVALID DAY!";   }

               return days;
          }
}
