package day17;

public class OddEven {

    public static void main(String[] args) {

        //write a program to print out a even number from 0 to 50;
        //write a program to print out a odd number from 0 to 50;

        int num=0;

        while(num<=50){

            System.out.print(num+" ");

            num+=2;//even number
        }
        System.out.println();
        System.out.println("num is: "+num);

        System.out.println("-----------------------");

        int num1=1;

        while(num1<=50){
            System.out.print(num1+" ");
            num1 +=2;
        }
        System.out.println();
        System.out.println("num1= "+num1);

        System.out.println("----------------------------");

        int cnt=0;

        while( cnt<=50){

            if (cnt%2==0){
                System.out.println(cnt+" is even number");
            } else {
                System.out.println(cnt+" is odd number");
            }
            ++cnt; }
    }
}
