package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        //print hello world 5 times
        //also keep the count of how many times you said hello

        int count=1;
        System.out.println("Hello World");
        //increase by 1 count=count+1;
        //or count +=1;
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");

        System.out.println("Count is "+count);
        System.out.println("------------------");
        int cnt=0;
        while(cnt<=5){
            System.out.println("Hello World");
            System.out.println("cnt value is "+cnt);
            ++cnt; //increase the value by 1
        }



    }
}
