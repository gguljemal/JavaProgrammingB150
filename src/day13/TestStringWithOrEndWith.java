package day13;

public class TestStringWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        //check whether String start with another string, its case sensitive
        System.out.println(name.startsWith("Mu"));

        System.out.println(name.startsWith("Mac"));

        //check whether String start with another string

        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("A"));
        System.out.println(name.endsWith("E"));


    }
}
