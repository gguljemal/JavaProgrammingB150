package day14;

public class EmailChecker {

    public static void main(String[] args) {

        /*create a variable called email, check for below conditions
        *if it does not contain character @ say invalid email
        * if it contains space say invalid email
        * if it endsWith @gmail.com ---->> gmail
        * if it endsWith @yahoo.com ---->> yahoo email
        * if it endsWith @mail.ru   ---->> russian email
         */

        String email = "gguljemal@gmail.com ";

        //! email.contains("@");
        boolean notContain = ! email.contains("@");
        //email.contains(" ");
        boolean mustContain = email.contains(" ");
        //email.endsWith ("@mail.com");
        boolean endWith1 = email.endsWith("@gmail.com");
        //email.endsWith ("@yahoo.com");
        boolean endWith2 = email.endsWith("@yahoo.com");
        //email.endsWith ("@mail.ru");
        boolean endWith3 = email.endsWith("@mail.ru");

        if (endWith1){
            System.out.println("Gmail");
        }
         else if (endWith2) {
            System.out.println("yahoo email");
        }
         else if (endWith3){
            System.out.println("russian email");
        }
         else if (mustContain || notContain){
            System.out.println("Invalid email");
        }
         else {
            System.out.println("Nothing");
        }
    }
}
