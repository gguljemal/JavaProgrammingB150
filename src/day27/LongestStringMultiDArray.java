package day27;

public class LongestStringMultiDArray {

    public static void main(String[] args) {

      String developers [] = {"Vladislav","Hasan","Tolkun","Abide"};
      String testers [] = {"Zhibekchach","Mohammed Sohrabi","Nursultan"};
      String businessAnalyst [] = {"Lisa","Ershad","Naila"};

      String scrumTeam [][] = {developers, testers,businessAnalyst};

      int maxLength = scrumTeam[0][0].length();
      String longestName = "";

        for (String eachGroup [] : scrumTeam) {

            for (String name : eachGroup) {
                if (maxLength<name.length()){
                    maxLength=name.length();
                    longestName=name;
                }
            }
        }
        System.out.println("maxLength = " + maxLength);
        System.out.println("Longest name is "+longestName);

        for (String group [] : scrumTeam) {
            for (String name : group) {
                if (maxLength==name.length()) {
                    System.out.println(name);
                }
            }
        }

    }
}
