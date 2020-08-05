package day31;

public class Calculator2 {

    public static void main(String[] args) {

 //       char operator = '-';  //it can be + - * /
 //       int num1 = 15;
 //       int num2 = 3;

        calculation(9,3,'/');
        calculation(20,5,'*');
        calculation(3,9,'x');

    }

    public static void calculation ( int num1, int num2, char operator){

        switch (operator){

            case '+':
                System.out.println("Addition result is: " + (num1+num2) );
                break;
            case '-':
                System.out.println("Subtraction result is: " + (num1-num2) );
                break;
            case '*':
                System.out.println("Multiplication result is: " + (num1*num2) );
                break;
            case '/':
                System.out.println("Division result is: " + (num1/num2) );
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }

    }
}
