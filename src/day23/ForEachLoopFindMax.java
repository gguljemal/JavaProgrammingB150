package day23;

public class ForEachLoopFindMax {

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

        // I need to pick up an item from this array so I can compare with other ones
        //can start which one I want

        long maxSalary = salaries[3];

        for (long salary : salaries){

            if (salary>maxSalary){

                maxSalary=salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}
