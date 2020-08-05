package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        //get the sum of numbers from 1-10

        int sum=0;
        for(int x=1; x<=10;++x){
            sum+=x;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
