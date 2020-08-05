package day34;

import day31.Calculator2;

public class MathAction {

    //calling the static methods of other classes

    public static void main(String[] args) {

        //call your buildDigitNumber method here from another class
        int result = PracticeMethodWithNumbers.buildDigitNumber(6,4,0);
        System.out.println("result = " + result);

        //how can i call static method called calculate in Calculator2 under
        //day31 package;

        Calculator2.calculation(10,20,'+');
    }


}
