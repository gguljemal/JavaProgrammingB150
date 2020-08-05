package day10;

public class Calculator {

    public static void main(String[] args) {

        /*if the operator variable is + print you are about to add numbers
         *if the operator variable is - print you are about to subtract numbers
         * if the operator variable is * print you are about to multiply numbers
         * if the operator variable is / print you are about to divide numbers
         */
        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '-':
                System.out.println("You are about to subtract numbers");
                break;
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
