package day27;

public class ShortestString_MultiArray {

    public static void main(String[] args) {

        String developers [] = {"Vladislav","Hasan","Tolkun","Abide"};
        String testers [] = {"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String businessAnalyst [] = {"Lisa","Ershad","Naila"};

        String scrumTeam [][] = {developers, testers,businessAnalyst};
        int minLength = scrumTeam[0][0].length();
        String shortestName = "";
//  Find the shortest string

        for (int i = 0; i < scrumTeam.length ; i++) {
            for (int j = 0; j < scrumTeam[i].length ; j++) {
                if (minLength>scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortestName=scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestName);
    }
}
