package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

   int myExcel [] [] = { {10,27,88,99} , {87,100} , {90,45,65} };

        System.out.println(Arrays.deepToString(myExcel));

        for (int numbers [] : myExcel) {

            for ( int number : numbers) {

                System.out.print(number+" ");
            }
            System.out.println();
        }

    }
}
