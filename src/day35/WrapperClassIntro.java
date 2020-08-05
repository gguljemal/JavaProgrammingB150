package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

    int x = 10;

        Integer x1 = new Integer(12);

        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        byte bValue = x2.byteValue();
        System.out.println("byte Value = " + bValue);

        double dValue = x3.doubleValue();
        System.out.println("double Value = " + dValue);
    }
}
