package day11;

public class StringEquality2 {

    public static void main(String[] args) {

        String name = "Maya"; //String literal

        String name1 = new String ("Maya");

        String name2 = "Maya";

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        System.out.println("USING == METHODS");
        System.out.println(name == name1);
        System.out.println(name == name2);

        //str1.equals(str2)

        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name1) );
        System.out.println(name.equals(name2));
    }
}
