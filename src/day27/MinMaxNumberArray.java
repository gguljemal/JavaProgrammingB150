package day27;

import java.util.Arrays;

public class MinMaxNumberArray {

    public static void main(String[] args) {

//  write a program that can find the minimum number for an array
//  DO NOT use sort method

    int scores[] = {100,36,589,36,369,547,56};
    int minScore=scores[0];

        for (int i = 1; i < scores.length ; i++) {

            if (scores[i]<minScore){

                minScore=scores[i];
            }
        }
        System.out.println("minScore= "+minScore);

        System.out.println("------------Second min number--------------");

        int min2Num = scores[0];

        for (int x = 0; x < scores.length ; x++) {

            if (scores[x]==minScore){
                continue;
            }
            if (min2Num>scores[x]){
                min2Num=scores[x];
            }
        }System.out.println("Second min is: "+min2Num);

        System.out.println("----------------Third min number------------------");

        int min3Num = scores[0];

        for (int y = 0; y < scores.length ; y++) {

            if (min2Num==scores[y] || minScore==scores[y]){
                continue;}
            if (min3Num>scores[y]){
                min3Num=scores[y];
            }
        }
        System.out.println("third min number is: "+min3Num);


        System.out.println("---------------MAX-----------------");
        int maxScore=scores[0];

        for (int i = 1; i < scores.length ; i++) {

            if (scores[i]>maxScore){

                maxScore=scores[i];
            }
        }
        System.out.println("maxScore= "+maxScore);

        }
    }

