package day22;

public class LoopingArray {

    public static void main(String[] args) {

        int scores [] =new int[4];

        scores[0]= 95;
        scores[1]= 70;
        scores[2]= 88;
        scores[3]= 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        System.out.println("--------------------");

        int itemCount=scores.length; // itemCount: 4
        int lastItemIndex=itemCount-1; //last index: 3

 //     for (int x=0; x<=lastItemIndex; x++) {}
 //     for (int x=0; x<=itemCount-1; x++){}
        for (int x = 0; x <scores.length ; x++) {

            System.out.println(scores[x]);

        }

        //print this array in reverse order
        for (int x =scores.length-1 ; x >=0 ; x--) {

            System.out.println(scores[x]);

        }



    }
}
