package day16;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the keyword to search ");
      String keyWordSearch=scan.next(); //"Java";
      String tabTitle=keyWordSearch+" -Google Search";

      if (tabTitle.startsWith(keyWordSearch) && tabTitle.endsWith("-Google Search"))
      {
          System.out.println("Test Passed");
      }
      else {
          System.out.println("Test Failed");
      }
    }
}
