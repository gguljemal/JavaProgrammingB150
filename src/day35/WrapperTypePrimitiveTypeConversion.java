package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

       Integer num1 = 100;//auto boxing --> new Integer (100)

       int num2 = Integer.valueOf("200");//auto-unboxing into 200
        //THIS CANNOT HAPPEN BY ITSELF
        //int num3 = "200";

       int num3 = Integer.parseInt("200");

       // use this number IPR2012-00001 and store the year into a variable
//        String caseNumber = "IPR2012-00001";


        System.out.println(getYearOutOfCaseNumber("IPR2012-00001") );
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));

        // how to turn String value into float value
        float f6 = Float.parseFloat("3.14");
        System.out.println(f6);

    }

    public static int getYearOutOfCaseNumber (String caseNumber){

//        int year;//-- get 2012 out of it
////        String cutCase = caseNumber.substring(3,7);
////        year = Integer.parseInt(cutCase);
////        System.out.println("year = " + year);
////        return year;

        return Integer.parseInt(   caseNumber.substring(3,7)  );
    }
}
