package day11;

public class PrimitiveEquality {

    public static void main(String[] args) {

        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("is c1 equal t c2 ");
        System.out.println(c1 == c2);

        System.out.println("is c1 equal t c3 ");
        System.out.println(c1 == c3);

        int num1 = 10;
        int num2 = 10;
        System.out.println("is num1 equal to num2");
        System.out.println(num1 == num2);

    }
}
