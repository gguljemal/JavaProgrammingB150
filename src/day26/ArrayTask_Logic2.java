package day26;

public class ArrayTask_Logic2 {

    public static void main(String[] args) {

    int scores [] = {156,101,76,187,87,110};
    int size = scores.length;

        System.out.println("size = " + size);

        String finalResult = "YES";

        for (int num : scores){

            if (num<=100){
               finalResult="NO";
               break;
            }
        }
        System.out.println("finalResult = " + finalResult);

}
}