package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {


        //from 1-100 print out all the numbers can be divided by 15 without remainder
        //form 1-100 count how many numbers can  be divided by 15

        int counter=0;

        for (int x=1;x<=100;++x){

            if(x%15==0){
                System.out.println(x);
            ++counter;
            }
        }System.out.println("counter = " + counter);


        String name ="Guljemal Gurbanova";
        int countOfA=0;

        for (int x=0;x<name.length();x++){

            System.out.println(name.charAt(x));
            
            if(name.charAt(x)=='a'){
                System.out.println("BINGO FOUND IT!!!");
                countOfA++;
            }
        }
        System.out.println("countOfA = " + countOfA);
    }
}
