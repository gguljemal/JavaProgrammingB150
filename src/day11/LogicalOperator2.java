package day11;

public class LogicalOperator2 {

    public static void main(String[] args) {

        // && 2ampersand &ampersand ------->> Logical AND operator
        //This is used to check both conditions are true at the same time

        //&& is called short circuit AND
        //---->> it does not check the next condition as long as the first condition is false
        //---->> just like if you have multiple condition for the rocket launching
        // is EngineRunning, isCommunicationSystemWorking, isAirEnough
        // if EngineRunning && isCommunicationSystemWorking && isAirEnough
        //if engineRunning is false then it does not go and check next conditions
        // & --->> Check each and every condition no matter what


        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);

    }
}
