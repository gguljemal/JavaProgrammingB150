package day06;

public class CompoundOperator2 {


        public static void main(String[] args) {

        /*
        -= , += , *= , /= , %= : are called shorthand operator, compound operator

        it can simplify the operation if you have same variable

         */

            int studentOnline= 263;
            studentOnline+= 5;
            System.out.println("There is "+ studentOnline+" students online.");

            studentOnline-= 3;
            System.out.println("3 student left so there is "+studentOnline);




    }

}
