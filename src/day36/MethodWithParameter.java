package day36;

public class MethodWithParameter {

    public static void main(String[] args) {

        int num = 10;
        addOneHundred(num);

        addOneHundred(25);
        addOneHundred(new Integer(100));

        System.out.println( addOneHundredAndReturn(num) );

    }

    public static void addOneHundred( int x ){

        System.out.println( x + 100 );

    }
    public static int addOneHundredAndReturn ( int x ){

        x = x+100;
        return x;

    }
}
