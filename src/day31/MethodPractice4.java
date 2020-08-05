package day31;

public class MethodPractice4 {

    public static void wakeUp(){
        System.out.println("Open your eye");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? Open it again!");
    }

    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button to make your coffee");
    }

    public static void studyJava(){
        System.out.println("think about java waking up");
        System.out.println("think about java drinking coffee");
        System.out.println("sit down and study java,practice practice!!!");
        System.out.println("Review last classes, come ready for the class");
    }

    public static void prepareKidsForSchool(){
        System.out.println("Kiss your kids to wake them up");
        System.out.println("prepare their breakfast and lunch");
        System.out.println("eat with them");
    }

    public static void sayILoveJava300 (){

        for (int i = 1; i <=300 ; i++) {
            System.out.print("I Love Java");
        }
        System.out.println();
    }

    public static void takeThemToSchool(){
        System.out.println("Take the to school bus");
        System.out.println("say good bye!");
    }

    public static void main(String[] args) {
       /*
    wake up
    drinkCoffee
    prepareKidsForSchool
    takeThemToSchool
    goToWork
    groceryShopping
    cooking
    studyJava
    goToSleep
     */
       wakeUp();
       drinkCoffee();
       prepareKidsForSchool();
       studyJava();
       takeThemToSchool();
       finallyAwake();
    }

    public static void finallyAwake (){

        finallyAwake();
        drinkCoffee();
    }
}
