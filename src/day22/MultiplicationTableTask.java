package day22;

public class MultiplicationTableTask {

    public static void main(String[] args) {

//        System.out.println("1 x 1 = " + 1 * 1);
//        System.out.println("1 x 2 = " + 1 * 2);
//        System.out.println("1 x 3 = " + 1 * 3);
//
//        for (int y = 1; y <= 9; y++) {
//
//            System.out.println("1 x " + y + " = " + 1 * y);
//        }
//
//        System.out.println("---------------------------------------");
//
//        for (int i = 1; i <= 9; i++) {
//
//            System.out.println("2 x " + i + " = " + 2 * i);
//        }

        System.out.println("-------------------------------------");

        for (int n = 1; n <= 10; n++) {

            System.out.println("Multiplication "+n);

            for (int i = 1; i <= 9; i++) {

                {
                    System.out.println(n + " x " + i + " = " + n * i);
                }
            }
        }
    }
}
