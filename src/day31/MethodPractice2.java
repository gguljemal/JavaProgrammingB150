package day31;

public class MethodPractice2 {

    public static void main(String[] args) {

        //write piece of reusable code to count 1-10
        //give a name count1to10                           :method name
        //no need for object when being called             :static
        //it should be accessible anywhere in your project :public
        //it does not return any value                     :void
        //does not need any external data when being called:(nothing inside)

        count1to10();
//      System.out.println();  do not want it in same line
        count1to10();
    }

    public static void count1to10(){

        for (int i = 0; i <=10 ; i++) {
            System.out.print(i + " ");  //one line
        }
        System.out.println();
    }


}
