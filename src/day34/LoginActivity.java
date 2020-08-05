package day34;

public class LoginActivity {

    public static void main(String[] args) {

        login1("my username","abc123");
        login1("user","abc123");

        boolean result = login2("user","abc123");
        System.out.println(result);
        System.out.println(login2("aaa","bbb"));


        if (login2("user","abc123") ){
            System.out.println("Add Java book to cart");
            System.out.println("Pay for Java books");
        }else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!");
        }

    }
    public static void login1 (String user, String password) {
         if (user.equals("user") && password.equals("abc123")) {
             System.out.println("LOG IN SUCCESSFUL");
         }else {
             System.out.println("LOG IN FAILED");
         }
    }

    public static boolean login2 (String user,String password){
//
//        if (user.equals("user") && password.equals("abc123")){
//            return true;
//        }else {return false;}
//             OR

        return user.equals("user") && password.equals("abc123");


    }
}
