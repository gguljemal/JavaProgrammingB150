package day31;

public class ExternalUseInMethod {

    public static void main(String[] args) {

        sayHelloTo("Batch 15");
        sayHelloTo("Kids");

    }

    public static void sayHelloTo(String name){
        System.out.println("Hello "+name);
    }


}
