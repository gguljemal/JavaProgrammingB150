package day21;

public class NumberStairCase {

    public static void main(String[] args) {

     /*
     print 5 times

     1234   //count from 1 to 4
     1234   //count from 1 to 4
     1234   //count from 1 to 4
     1234   //count from 1 to 4
     1234   //count from 1 to 4
      */

     for(int x=1;x<=5;x++){
         System.out.println("step:"+ x);

         for(int i=1;i<=4;i++){
             System.out.print(i+" ");
         }
         System.out.println();
     }
        System.out.println("---------------------------------");

     for(int x=1;x<=5;x++){
//         System.out.println("step"+ x);

     for(int i=1;i<=x;i++){
         System.out.print(i+" ");
     }
         System.out.println();
     }
    }
}
