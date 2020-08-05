package day18;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DoWhileAtLeastRunOnce {

    public static void main(String[] args) {

       int x=100;

       do{
           System.out.println("KEEP GOING");
       }while(x<5);

        System.out.println("THE END");

        System.out.println("---------------------------");

        while (x<5){
            System.out.println("KEEP GOING");
        }
    }
}
