package myPractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PracticeNoScanner {

    public static void main(String[] args) {

        int treeSize = 0;

        for (int year = 1; year <= 3 ; year++) {

            treeSize++;

            System.out.println("year" + year+ " - growth 1 cm");
            System.out.println("tree size: "+treeSize+"cm");
        }
        for (int year = 4; year <=10 ; year++) {

            treeSize+=2;

            System.out.println("year" + year+ " - growth 2 cm");
            System.out.println("tree size: "+treeSize+"cm");
        }
        }
    }


