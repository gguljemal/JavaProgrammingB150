package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        //indexOf---->>
        //find out index of another String inside This String
        //             012345678901
        String name = "Game of Java";
        //find out the location of Java
        //find out the location of letter 0
        //find out the location of first space

        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));

        System.out.println("find out the location of uppercase O");
        System.out.println(name.indexOf("O"));

        System.out.println("find out the location of first space ");
        System.out.println(name.indexOf(" "));

    }
}
