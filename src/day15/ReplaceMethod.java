package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        //Replace method of the String

        String message = "I love Pumpkin, Pumpkin is fun!!!";
        message=message.replace("Pumpkin","Java");

        System.out.println(message);

        String message2 = "Happy Thanks Giving to All";
        //"Happy Thanks Giving to All!!!"---->>"Happy Thanksgiving to All!!"
        message2=message2.replace("Thanks Giving","Thanksgiving");
        System.out.println(message2);
        //what if i want to replace space from everywhere
        message2=message2.replace(" ", "");
        System.out.println(message2);

        String message3 = "Tomorrow is off no!";
        //how do we remove NO!
        message3 = message3.replace("no","");
        System.out.println(message3);



    }
}
