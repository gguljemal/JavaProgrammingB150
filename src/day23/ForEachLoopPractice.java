package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

       /*
       create a long array or 5 items called salaries
       put your salary amounts that ok for your offer
       * use for each loop to iterate over them & print them out
       OPTIONALLY:
       print only the salary more than 100000

       OPTIONALLY:
       use for each loop to find the max
       use for each loop to find the sum
        */

       long salaries [] = {1000L, 2000L, 3000L, 4000L, 5000L};

       for ( long salary : salaries ){

           int sum = 0;
           System.out.println("salary = " + salary);
           System.out.println("sum = " + sum);
       }

       for (long salaryIWant : salaries ){

           if (10000<salaryIWant){
               System.out.println("salaryIWant = " + salaryIWant);
           }
          // or we can use continue
           // ıf (salaryIWant<=10000){
           //       continue;  } System out println (salaryIWant)
    }
}
}
