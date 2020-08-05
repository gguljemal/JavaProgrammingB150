package day14;

public class StringMethodCharAt {

    public static void main(String[] args) {

        //charAt method of String
        //it will return a character at certain location specified

        String name = "Guljemal";

        System.out.println(name.charAt(0) );
        System.out.println(name.charAt(1) );
        System.out.println(name.charAt(2) );
        System.out.println(name.charAt(3) );
        System.out.println(name.charAt(4) );
        System.out.println(name.charAt(5) );
        System.out.println(name.charAt(6) );
        System.out.println(name.charAt(7) );

        String name1 = "Seth";

        char nm = name1.charAt(0);
        char nm1 = name1.charAt(1);
        char nm2 = name1.charAt(2);
        char nm3 = name1.charAt(3);

        System.out.println(nm+" "+nm1+" "+nm2+" "+nm3);

    }
}
