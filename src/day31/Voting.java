package day31;

public class Voting {

    public static void main(String[] args) {

        checkEligibility(20);
        checkEligibility(63);

        //or we can initialize another variable and use it as external data in method

        int yourAge = 16;
        checkEligibility(yourAge);

    }

    public static void checkEligibility(int age) {

//        int age = 15;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible");
        }
    }


}
