package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

//        int x='A';
//      char myChar='A';
//      char my=100;
//        System.out.println(myChar);
//        System.out.println(my);
//        System.out.println(x);


        char myChar='A';

        System.out.println(myChar); //65 in number and increasing by 1 66-67-68-69 gives another character
        System.out.println(++myChar);//66
        System.out.println(++myChar);//67
        System.out.println(++myChar);//68
        System.out.println(++myChar);//69
        System.out.println(++myChar);//70

        for(char iChar='A';iChar<='Z';++iChar){
            System.out.print(iChar+" ");
        }
        System.out.println();
        for (char kChar='z';kChar>='a';--kChar){
            System.out.print(kChar+" ");
        }

    }
}

