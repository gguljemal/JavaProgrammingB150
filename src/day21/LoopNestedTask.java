package day21;

public class LoopNestedTask {

    public static void main(String[] args) {

        //count from1-10---> print only odd numbers
        //repeat this 4 times

        for(int x=1;x<=4;x++){

            System.out.println("step "+x);

            for(int i=1;i<=10;i++){

                if(i%2==0){ //or we can use if(i%2==1)
                    continue;//
                }
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
