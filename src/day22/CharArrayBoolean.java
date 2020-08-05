package day22;

public class CharArrayBoolean {

    public static void main(String[] args) {

        //create a char array that whole all the letter from your name
        //and assign values using each characters of your first name

        char name[]=new char[4];

        name [0]='M';
        name [1]='a';
        name [2]='y';
        name [3]='a';
        //then print out each character

        System.out.print(""+name[0]+name[1]+name[2]+name[3]);
        System.out.println();
        //or
        System.out.println(name);

        boolean yesNo[]=new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=9<11;//false
        yesNo[2]=10>7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


    }
}
