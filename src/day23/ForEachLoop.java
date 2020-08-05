package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double prices [] = {99.23, 11.99, 100.23, 99.99, 56.34};

        //for each loop syntax
        //for ( dataTypeOf your array variable name for each item : your array variable ) {
        //     do something with array items
        //  }
        
        for(double eachPrice : prices ){
            
            System.out.println("eachPrice = " + eachPrice);
        }
//       FOR EACH LOOP can be used for array
//       there is no infinite loop ever in for each loop

        for (int i = 0; i <prices.length ; i++) {
            
            double eachPrice = prices[i];
            System.out.println("eachPrice = " + eachPrice);
        }
    }
}
