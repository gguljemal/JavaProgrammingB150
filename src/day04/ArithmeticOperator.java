package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {

        System.out.println ( 5+3 );
        System.out.println ( 5-3 );
        System.out.println ( 5*3 );
        System.out.println ( 5/3 );

        // arithmetic operator between two int will have only int result!!!

        System.out.println ( 5+3.0d );
        System.out.println ( 5-3.0d );
        System.out.println ( 5*3.0d );
        System.out.println ( 5/3.0d );
        System.out.println ( 5/3.0f );

        //store above number in variables
        //and replace above statements with variables instead

        int pens = 5 ;
        int pencils = 3;
        double grade = 3.0d;
        float price = 3.0f;

        System.out.println(pens + pencils);
        System.out.println (pens-pencils);
        System.out.println (pens*pencils);
        System.out.println (pens/pencils);

        System.out.println (pens+grade);
        System.out.println (pens*grade);
        System.out.println (pens-grade);
        System.out.println (pens/price);
        System.out.println (pens/grade);








    }
}
