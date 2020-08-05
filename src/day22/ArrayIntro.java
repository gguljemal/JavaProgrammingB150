package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        int scores [] =new int[4];

        scores[0]= 95;
        scores[1]= 70;
        scores[2]= 88;
        scores[3]= 95;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //updating the value at certain index

        scores[1]=99;
        System.out.println(scores[1]);

        //once array is created with certain size, we CAN NOT CHANGE THE SIZE!!!

        //create an byte array with size 4
        //and store it into a variable called data
        //assign value for each index location
        //print out the values at each index then print it out

        byte data [] = new byte[4];

        data[0]= 10;
        data[1]= 20;
        data[2]= 30;
        data[3]= 40;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        //when we update
        data[3]=127;
        System.out.println(data[3]);


    }
}
