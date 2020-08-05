package day32;

public class ABCAction {

    public static void main(String[] args) {

        printAtoZ();
        printZtoA();

        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');

    }


    //if beginning character is before ending character
    //for example beginning A ending D --->>ABCD
    //if beginning character is after ending character
    //for example beginning D, ending A---->>DCBA

    public static void printAlphabetInRange(char beginning, char ending ){

       if(beginning<ending){
           System.out.println("we need to increment from " + beginning+" till "+ending);
           for (char i = beginning; i <=ending ; i++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }else if (beginning>ending){
           System.out.println("we need to decrement from " + beginning+" till "+ending);
           for (char i = beginning; i >=ending ; i--) {
               System.out.print(i+" ");
           }
           System.out.println();
       }else{
           System.out.println("They are same character");
       }

    }
    //printAtoZ
    //create a method that has no parameter
    //and print A-Z in one line
    public static void printAtoZ(){

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoA() {

        for (char i = 'Z'; i >= 'A'; i--) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

}
