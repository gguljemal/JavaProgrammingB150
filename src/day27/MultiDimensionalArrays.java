package day27;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // 2D Array is an array that contains couple of single dimensional arrays

        int array2D [][] = { {1,2,3} , {4,5,6} };
 //          index             0           1


 //     array2D[0]==>{1,2,3}

        System.out.println(array2D.length);
        System.out.println(Arrays.toString(array2D[0]));
        System.out.println(Arrays.toString(array2D[1]));

//      array2D[0][2]==>3
        System.out.println(array2D[0][2]);  //returns unt value
//      print 5: array2D[1][1]
        System.out.println(array2D[1][1]);  //returns int value

        System.out.println(Arrays.toString(array2D));// will not give correct answer
 //       for 2 or more dimensional arrays we will use Arrays.deepToString(multi-D Arrays)

        System.out.println(Arrays.deepToString(array2D));

    }
}
