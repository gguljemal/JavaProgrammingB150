package day26;

import java.util.Arrays;

public class ToCharArrayPractice {

    public static void main(String[] args) {

    // 2 additional String methods related to array
    //toCharArray(), another is split(bySomething)

    String survey = "Complete B15 Online 1 Month Survey";
     int count=0;
    char surveyChar [] = survey.toCharArray();
        System.out.println(Arrays.toString(surveyChar));

        for (char eachChar : surveyChar) {
            System.out.println("Each char is: "+eachChar);
            count++;
        }
        System.out.println("count = " + count);

        int x = 0;
        while(x<surveyChar.length){
            System.out.println("Each char is: "+surveyChar[x]);
            x++;
        }

        for (int i = 0; i < surveyChar.length ; i++) {
            System.out.println("Each char is: "+surveyChar[i]);
        }

     //   int y = 0;
 //       do{System.out.println("Each char is: "+surveyChar[y]);
 //       y++}
   //     while(y<surveyChar.length);
    }
}
