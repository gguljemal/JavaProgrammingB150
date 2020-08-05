package day33;

public class warmUp {

    public static void main(String[] args) {

        String spelledName = getSpelledName("guljemal");
        System.out.println(spelledName);
        System.out.println(getSpelledName("guljemal"));

        System.out.println(getSpelledName2("maya"));
    }

    /*
    *getSpelledName
    *this method will put dash in between given String: Akbar--->A-k-b-a-r
    * @param name this is the name parameter
    * @return the name has dash in between
     */

    public static String getSpelledName(String name){

        String result = "";

        for (int i = 0; i < name.length() ; i++) {
            result+=name.charAt(i);

            if (i!=name.length()-1){
                result+="-";
            }
        }
        return result;
    }
    public static String getSpelledName2(String name){

        String result = "";
        for (int i = 0; i <name.length()-1 ; i++) {
            result+=name.charAt(i)+"-";
        }
        return result+name.charAt(name.length()-1);
    }
}
