package day45;

public class Apple extends Fruit {

      //FIRST LINE OF ANY CONSTRUCTOR IS AUTOMATICALLY CALLING
      // SUPER() even if we do not call any!!!

    public Apple() {
// I want to reuse the functionality
// already written in super class constructor
// we can use super() or super(arguments here)
// to call super class's constructor
 //       super();
// ===>> we cannot call more than 1 constructor from super
// how to call constructor with 1 argument
        super("test");

        System.out.println("Message from Apple Constructor");
    }

    public static void main(String[] args) {

        Apple a1 = new Apple();

    }
}
