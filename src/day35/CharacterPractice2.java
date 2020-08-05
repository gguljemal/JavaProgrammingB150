package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        //for each char in string check if it is number
        //if yes store in a String and use that String to get Integer
        //then sum it up

        String str = "A34B123C4X";
        int sum = 0;

        char allChars [] = str.toCharArray();

        for (char each: allChars) {

            if (Character.isDigit(each)){

                System.out.println("each = " + each);

               int eachNum = Integer.parseInt(each+"");
                sum=sum+eachNum;
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("-------FOR-I LOOP ---------------------------");

        int sumForLoop=0;

        for (int i = 0; i < str.length() ; i++) {

            if(Character.isDigit(str.charAt(i))){
                sumForLoop += Integer.parseInt(str.charAt(i)+"");
            }
        }
        System.out.println("sumForLoop = " + sumForLoop);
    }
}
