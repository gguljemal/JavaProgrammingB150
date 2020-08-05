package day08;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit= 60;
        int yourCurrentLimit=55;

        //If the currentLimit is more than speed limit
        //get pulled over by the police
        //given ticket
       // taken away some points on your license
        //go to court

        boolean IamSpeeding = yourCurrentLimit>speedLimit;

        if (IamSpeeding) {
            System.out.println("get pulled over by police");
            System.out.println("police will give you a ticket");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }

            else {

                System.out.println("go to shop!!!");
            System.out.println("read a book");
            System.out.println("enjoy you day");
            }

        }

    }

