package day14;

public class StringReview {

    public static void main(String[] args) {

        String str= "I like Pumpkin";

        System.out.println(str.equals("pumpkin"));

        //contain: ---->> it checks whether a string exists in another string
        // and result is boolean (true or false)

        System.out.println("Does it contains Pumpkin : ");

        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");

        System.out.println("gotPumpkin = " + gotPumpkin);

        //startWith endsWith
        //check whether a string starts with another string
        //check whether a string ends with another string
        //and returns to true or false result

        boolean startedWith = str.startsWith("I");

        System.out.println("Started with I = " + startedWith);

        boolean endWithPumpkin = str.endsWith("Pumpkin");

        System.out.println("end with Pumpkin = " + endWithPumpkin);

        //TASK -----> PASSWORD VALIDATOR
        //MINIMUM 8 CHAR MAX 16 CHAR
        //IT MUST CONTAIN _ OR $
        //IT MUST NOT CONTAINS SPACE
        //IT MUST START Ab
        /* if any of above conditions does not match say INVALID PASSWORD
        else say GOOD PASSWORD!
         */

        String password = "Ab_1534654$";

        //MINIMUM 8 CHAR MAX 16 CHAR
        //password.length()>=8 && password.length ()<=16
        boolean min8max16 = password.length()>=8 && password.length ()<=16;

        //IT MUST CONTAIN _ OR $
        //password.contains("_") || password.contains("$")
        boolean mustContain= password.contains("_") || password.contains("$");

        //IT MUST NOT CONTAINS SPACE
        //! password.contains(" ")
        boolean mustNotContainSpace = !password.contains(" ");

        //IT MUST START Ab
        //password.startWith("Ab");
        boolean startsWith = password.startsWith("Ab");

        if (min8max16 && mustContain && mustNotContainSpace && startsWith){
            System.out.println("VALID PASSWORD!!!");
        }else {
            System.out.println("INVALID PASSWORD!!!");
        }

    }
}
