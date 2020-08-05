package day22;

public class GenerateLink {

    public static void main(String[] args) {

        /* here is the direct links to lead you to correct days

        https://learn.cybertekschool.com/courses/278/modules#3317
        this will lead you to day 21
        https://learn.cybertekschool.com/courses/278/modules#3318
        this will lead you to day 22
        https://learn.cybertekschool.com/courses/278/modules#3319
        this will lead you to day 23
        https://learn.cybertekschool.com/courses/278/modules#3320
        this will lead you to day 24
        and so on
        so write program to generate the links to
        lead you to the right module of the day 21 all the way till day 56
         */


        for(int day=21; day<=56;day++){

            System.out.println("https://learn.cybertekschool.com/courses/278/modules#33"+(day-4)+
                    " this will lead you to day "+ day  );
        }

        System.out.println("-----------------------------------------------------------------------");

        for(int x=1; x<=22;x++){     //3297 is day 1 module ID
            System.out.println("https://learn.cybertekschool.com/courses/278/modules#"+(x+3296)+
                    " this will lead you to day "+ x );
        }




    }
}
