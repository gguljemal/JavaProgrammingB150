package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount = 2;

        // two buttom equation are same result
        offerCount=offerCount+1;
        offerCount+=1;


        //++offerCount number will increase by 1 or
        //--offerCount number will be decrease by1
        ++offerCount;

        System.out.println("Offer now is increased by 1 = "+ offerCount);

        --offerCount;

        System.out.println("Offer now is decreased by 1 = "+ offerCount);


    }
}
