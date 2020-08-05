package day12;

public class LoginTest2 {

    public static void main(String[] args) {

        String userName = "abc";

        boolean userNameCorrect = userName.equals("ABC");
        System.out.println(userNameCorrect);

        boolean userNameCorrect2= userName.equalsIgnoreCase("ABC");
        System.out.println(userNameCorrect2);


        System.out.println("My name");

        String myName = "guljemal";

        boolean myNameEqual= myName.equals("Guljemal");
        System.out.println(myNameEqual);

        boolean myNameIgnore= myName.equalsIgnoreCase("Guljemal");
        System.out.println(myNameIgnore);
    }
}
