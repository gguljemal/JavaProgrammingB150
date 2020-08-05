package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        //Pre-increment ++score
        //Post increment score++
        //Pre-decrement --score
        //Post decrement score--

        int apple = 8;
        apple ++;
        System.out.println(apple);
        //System.out.println(++apple);
        System.out.println(apple++);
        System.out.println(apple);

        int score = 50;
        System.out.println(++score);//51
        System.out.println(score++);//51
        System.out.println(score);//52
        System.out.println(--score);//51
        System.out.println(score--);//51
        System.out.println(score);//50










    }
}
