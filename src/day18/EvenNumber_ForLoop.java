package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

     //skip counting by 2 start from 0---100

        for (int x=0; x<100;x+=2 )
        {
            System.out.print(x+" ");
            ;
        }
     //skip counting by 3 start from 0---100
        System.out.println();

       for(int x=0;x<100;x+=3){

           System.out.print(x+" ");
       }
       for(int x=0;x<100;x++){

           if(x%2==0){
               System.out.println(x+" is even number");
           }
           System.out.println("--------------------");

           for(int i=0;i<100;i++){

               if(i%5==0 && i%3==0){
                   System.out.println(i+" is FIZZ BUZZ number");
               }

           }
       }
    }
}
