package day15;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        //declare a variable to store your name
        /*
        check whether your name length is less than 4
        if so print short Name
        if it is within 5-10
        if its more than 11, print longer name
        *check whether your name has either character a and e
        if so--->>name with a and e
        if not--->>i don't have both a and e in my name
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your name please : ");
        String name = scan.next();

        int lengthOfName = name.length();
        System.out.println("Length of the name : "+lengthOfName);

        if (lengthOfName<4){
            System.out.println("Short name");
        }else if (lengthOfName>=4 && lengthOfName<=11) {
            System.out.println("medium name");
        }else {
            System.out.println("Longer name");
        }
//         System.out.println(name.length()<4);
//        System.out.println(name.length()>=5 name.length()<=10);
//        System.out.println(name.length()>11);//--->Longer name
//        System.out.println(name.contains("a") name.contains("e"));

        if (name.contains("a") || name.contains("e")) {
            System.out.println("name contains a and e ");
        }else {
            System.out.println("i don't have both a and e in my name");
        }


    }
}
