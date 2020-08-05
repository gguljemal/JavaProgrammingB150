package day08;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {

        /*
        *given your currentSpeed, speedLimit
        * check whether the current speed is
        * more than 90 -->> jail
        * more than 80 and less than or equal 90-->> reckless driving
        * more than 70 and less than or equal 80 -->> point taken
        * more than 60 and less than or equal 70 -->> warning
        * if not speeding, keep driving
         */

        int currentSpeed = 100;

        if (currentSpeed>90) {

            System.out.println("Jail time!!");
        }
        else if (currentSpeed>80){
            System.out.println("Reckless driver");
        }
        else if(currentSpeed>70) {
            System.out.println("point taken");
        }
        else if(currentSpeed>60){
            System.out.println("Warning");
        }
        else {
            System.out.println("keep driving!");
        }


    }
}
