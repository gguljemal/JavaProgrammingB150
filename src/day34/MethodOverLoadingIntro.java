package day34;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {
         sayHello();
         sayHello("Ser");
         sayHello(100);
        System.out.println(sayHello("gul","jemal"));
    }
    //method overloading:
    //using same name and different parameter for methods
    //to reuse the name for similar action
    //IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

    public static void sayHello (){
        System.out.println("Hello, World");
    }
    public static void sayHello (String name){
        System.out.println("Hello, "+name);
    }
    public static void sayHello (int num){
        System.out.println("Hello, "+num);
    }
    public static String sayHello(String firstName, String lastName){

        String fullName = "Hello " + firstName+lastName;
        return fullName;
    }
}
