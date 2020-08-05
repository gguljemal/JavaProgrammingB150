package day11;

public class ScoreChecker {

    public static void main(String[] args) {

      /* create a variable called score assign a value of your choice
      *if the score is less than 0 or more than 100 --->>INVALID SCORE!!!
      *If score is 100 ---> PERFECT SCORE!
      *If the score is between 70-100 --->YOU HAVE PASSED!!!
      *Else you have failed!!!!

      OPTIONAL: add more condition for failing score
      if the score is less than 20 ---> Come to my office
      if the score is between 30-40 ---> Attend additional classes
      if the score is between 40-70 ---> Little bit more study will let you pass
       */

      int score = 101;
      if (score<0 || score>100){
         System.out.println("INVALID SCORE!!!");
      }
      else if (score==100){
          System.out.println("PERFECT SCORE!!!");
      }
      else if (score>70 && score<100){
          System.out.println("YOU HAVE PASSED!!!");
      }
      else {
          System.out.println("You have failed!!!!");
      }
    }
}
