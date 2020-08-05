package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        //count from 1 to 5;
        //do {
        // take some action and repeat it
        // }while(some condition is true);

        int x=1;

        do{
            System.out.println(x);
            ++x;
        }while(x<=5);

        //count from 5 to 1 :
        int y=5;

        do{
            System.out.println(y);
            --y;
        }while(y>0);
    }
}
