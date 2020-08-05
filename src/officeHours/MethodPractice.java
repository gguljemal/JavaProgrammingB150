package officeHours;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodPractice {

    public static void main(String[] args) {

        oddEven(7);
        oddEven(100);

        System.out.println(convertKmToMile(1));
        System.out.println(convertGallonToLit(1));

        int[] arr = {2, 3, 5, 6, 8};
        descentOrder(arr);

        calculation(10,5,'^');
        calculation2(10,10,'+');

    }
    // write method that can verify any number if it is even or odd

    public static void oddEven(int x) {

        if (x % 2 == 0) {
            System.out.println(x + " is even number");
            return;
        }
        System.out.println(x + " is odd number");
    }

    //1. write a method that can convert km to miles
    //             hint: 1 km = 0.612 miles

    public static double convertKmToMile(double x) {

        return x * 0.612;
    }
//    2. write a method that can convert gallons to litters
//    hint: 1G = 3.75 L

    public static double convertGallonToLit(double x) {

        return x * 3.75;
    }
    //3. write a method that can print out the array in Descending order

    public static void descentOrder(int[] x) {

        Arrays.sort(x);
        for (int i = x.length - 1; i >= 0; i--) {

            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
//     4. write a method that accepts 3 parameters: 2 numbers and 1 operator
//    and prints out the calculation
//    if operator is not between [-,+,*,/,%] output should be Invalid Operator
//    ex: calculate (10,2,"*") ==> 20;
//    calculate (20,2,"~") ==> invalid operator;

    public static void calculation(int x, int y, char operators) {

        if (operators == '-') {
            System.out.println(x - y);
        } else if (operators == '+') {
            System.out.println(x + y);
        } else if (operators == '*') {
            System.out.println(x * y);
        } else if (operators == '/') {
            System.out.println(x / y);
        } else if (operators == '%') {
            System.out.println(x % y);
        } else {
            System.out.println("invalid operator");
        }
    }

 //5. write a method that can calculate grade
        //        if score is 100 ~ 90 ==> A
        //        if score is 89 ~ 80 ==> B
        //        if score is 79 ~ 70 ==> C
        //        if score is 69 ~ 60 ==> D
        //        if score is 0 ~ 59 ==> F
        //        otherwise ===> Invalid Score

    public static void calculation2(int x, int y, char operators){

        switch (operators){
            case '-':
                System.out.println(x - y);
                break;
            case '+':
                System.out.println(x + y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println("invalid operator");

        }
    }
//    5. write a method that can calculate grade
//        if score is 100 ~ 90 ==> A
//        if score is 89 ~ 80 ==> B
//        if score is 79 ~ 70 ==> C
//        if score is 69 ~ 60 ==> D
//        if score is 0 ~ 59 ==> F
//        otherwise ===> Invalid Score

}
