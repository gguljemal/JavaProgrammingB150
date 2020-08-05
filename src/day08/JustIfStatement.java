package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double version= scan.nextDouble();

        if (version==1.5){ System.out.println("Cupcake");}
        else if(version==1.6){System.out.println("Donut");}
        else if(version==2.1){System.out.println("Eclair");}
        else if (version==2.2){System.out.println("Froyo");}
        else if (version==2.3){System.out.println("Gingerbread");}
        else if(version==3.1){System.out.println("Honeycomb");}
        else if(version==4.0){System.out.println("Ice Cream Sandwich");}
        else if (4.31==version){System.out.println("Jelly Bean");}
        else if (version==4.1){ System.out.println("Jelly Bean");}
        else if (4.44==version){System.out.println("KitKat");}
        else if (4.4==version) {System.out.println("KitKat");}
        else if (5.11==version){System.out.println("Lollipop");}
        else if (5.0==version){System.out.println("Lollipop");}
        else if (8.1==version){System.out.println("Oreo");}
        else if (8.0==version){System.out.println("Oreo");}
        else if (9.0==version){System.out.println("Pie");}
        else {System.out.println("Sorry, I don't know this version!");}

    }
}
