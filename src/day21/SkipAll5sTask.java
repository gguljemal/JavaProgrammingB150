package day21;

public class SkipAll5sTask {

    public static void main(String[] args) {

        //count 1 to 100
        // skip all the numbers divided by 5

        for(int x=1; x<=100; x++){

            if(x%5==0){
                System.out.println("Skipping"+x);
                continue;
            }
            System.out.println(x);
        }
//        without continue statement

        for(int x=1; x<=100;x++){
            if (x%5!=0){
                System.out.println(x);
            }else{
                System.out.println("SKIPPING"+x);
            }
        }
    }
}
