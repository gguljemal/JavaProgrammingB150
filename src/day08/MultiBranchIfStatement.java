package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        /*
         *more tha 70 -->point taken
         * more than 60 and less than 70 -->warning
         * if not speeding keep driving
         */
        int currentSpeed = 50;

        if (currentSpeed > 70)
        {
            System.out.println("you are speeding more than 70--Points taken!!!");
        }

        else if (currentSpeed > 60)
        {
            System.out.println("your speed is less than or equal 70 but more than 60");
        }

        else {
            System.out.println("Keep driving you are good!!!");
        }
    }
    }


