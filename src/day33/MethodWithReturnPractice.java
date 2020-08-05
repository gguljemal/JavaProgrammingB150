package day33;

public class MethodWithReturnPractice {

    public static void main(String[] args) {

     int sum = getSumFrom1toX(5);
        System.out.println(sum);
        System.out.println(getSumFrom1toX(5));


        String myEmail = buildEmail("Gul","Gurban");
        System.out.println(myEmail);
        System.out.println(buildEmail("maya","Gurban"));

        //you are given variable fullName that has first name and last name
        //use this full name to generate GOT_Email
        String fulName = "Susan Cure";

        String part1 = fulName.split(" ")[0];
        String part2 = fulName.split(" ")[1];
        String herMail = buildEmail(part1,part2);
        System.out.println(herMail);
//       second way to do it
        String fulNameSplit [] = fulName.split(" ");
        String herMail2 = buildEmail(fulNameSplit[0],fulNameSplit[1]);
    }
    /*
    *getSumFrom1toX
    * this method should calculate the sum of
    * the numbers from 1 to the number user passed
    * @param x final numbers to be added
    * @return the sum of numbers from 1 to x
     */
    public static int getSumFrom1toX (int x){
        int sum = 0;

        for (int i = 1; i <= x ; i++) {

            sum+=i;
        }
        return sum;
    }

    /*
    *buildEmail
    * this method should build email using users first and last name
    * for example John Snow --->>JSnow@NightWatch.com
    * @param firstName users first name
    * @param lastName users last name
    * @return the email created using
    * firstName initial + lastName + @NightWatch.com
     */

    public static String buildEmail (String name,String lastName){

        String email = name.charAt(0)+lastName+"@NightWatch.com";

        return email;
    }
}
