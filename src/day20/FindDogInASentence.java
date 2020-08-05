package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        //given sentence, find out the location of the dog


        //            01234567890123456789012345678901234567890123
        //String msg="I like Dog, Dogs are cute, Dogs are friendly";
        /*
        *I l
        *  li
        * lik.....shifting 1-1 with three character
        *
         */
//                                                         40
        //          01234567890123456789012345678901234567890123
        String msg="I like Dog, Dogs are cute, Dogs are friendly";
        int lastCharIndex= msg.length()-1;

        for(int x=0;x<=msg.length()-3;x++){

            String current3char=msg.substring(x,x+3);
           // System.out.println(x+" : "+current3char);
            if (current3char.equals("Dog")){

                System.out.println("BINGO!!!AT "+x);
            }
        }

    }
}
