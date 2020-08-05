package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double prize[]=new double[5];

        System.out.println(prize[0]);//if you do not give any value will get 0 as result

        //cannot print out array variable directly to see what is inside

        System.out.println(prize);

        prize[0] = 2.46;
        prize[1] = 12.96;
        prize[2] = 992.1;
        prize[3] = 500;
        prize[4] = 65.123;
        // what if I put more index, it will not work
        //prize[5]=165.3;

        System.out.println(prize[0]);
        System.out.println(prize[1]);
        System.out.println(prize[2]);
        System.out.println(prize[3]);
        System.out.println(prize[4]);
    }
}
