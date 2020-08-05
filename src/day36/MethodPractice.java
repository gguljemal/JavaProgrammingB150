package day36;

public class MethodPractice {

    public static void main(String[] args) {

        Boolean result1 = checkNumberContain("neden");
        System.out.println(result1);

        System.out.println(checkNumberContain("neden07"));
    }

    /**
     * write a static method to accept a String and return Boolean (Yes Uppercase),
     * it should  return true if the String contains at least one number.
     * @param sentence
     * @return true Boolean Object if the String contains at least one number.
     */
    public static  Boolean checkNumberContain (String sentence){

        for (int i = 0; i < sentence.length() ; i++) {

            char each = sentence.charAt(i);

            if (Character.isDigit(each)){
                return Boolean.valueOf(true);
            }
        }
        System.out.println("NO NUMBER FOUND!!!");
        return Boolean.valueOf(false);
    }
}


