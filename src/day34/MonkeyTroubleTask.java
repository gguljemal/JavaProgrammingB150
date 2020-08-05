package day34;

public class MonkeyTroubleTask {

    public static void main(String[] args) {
        System.out.println( monkeyTrouble(true,true));
        System.out.println( monkeyTrouble(false,false));
        System.out.println( monkeyTrouble(false,true));

        System.out.println( monkeyTrouble2(true,false));
        System.out.println( monkeyTrouble2(true,true));
    }

    /**
     * A method that return true only if both monkeys are smiling ot not
     * @param aSmile
     * @param bSmile
     * @return true only if both monkeys are smiling or not
     */
    public static boolean monkeyTrouble(boolean aSmile,boolean bSmile){
 //       return aSmile==bSmile;

        if (  (aSmile && bSmile) || (!aSmile && !bSmile) ){
            return true;
        }else {
            return false; }
  // or return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /**
     *
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static String monkeyTrouble2(boolean aSmile,boolean bSmile){

        if (  (aSmile && bSmile) || (!aSmile && !bSmile) ){
            System.out.println("Yes");
        }else {
            System.out.println("No"); }

        return "";
    }
}
