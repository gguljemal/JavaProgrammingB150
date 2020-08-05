package day31;

public class MethodIntro {

    public static void main(String[] args) {

        //2 WAYS to call static methods
        // 1 - Class name.methodName (external data if needed)
        //if you are in same class
        //you can directly called them
        // 2 - methodName (external data if needed)

       // 1 way ---> Optional if you are in same class
        MethodIntro.sayHello();
        // 2 way
        sayHello();
        sayHello();

    }//main method is ends here!!!

    //DO NOT CREATE A METHOD INSIDE MAIN METHOD

    public static void sayHello() {

        System.out.println("Hello World ");
        System.out.println("My name is Juma ");
        System.out.println("I love Java");

    }
}
