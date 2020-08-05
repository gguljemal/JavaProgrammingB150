package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

      String name = "Arya Stark";

        System.out.println("if name contains small \"st\"? " + name.contains("st"));// false
        //I wanna check whether this name contains st no matter the case
        //so I want to store the uppercase version of this name then check for ST

        String upperCaseName = name.toUpperCase();//"ARYA STARK";
        System.out.println("upperCaseName contains ST or not ? "+upperCaseName.contains("ST"));

        String lowerCaseName =name.toLowerCase();//"arya stark";
        System.out.println("lowerCaseName contains st or not ? "+lowerCaseName.contains("st"));

                         //String------->>string
        System.out.println(lowerCaseName.contains("st"));
                            //int---------->>string= does not make sense
        //System.out.println(name.length().toUpperCase());


    }
}
