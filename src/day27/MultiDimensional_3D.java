package day27;

import java.util.Arrays;

public class MultiDimensional_3D {

    public static void main(String[] args) {

        //2D Array: contains 1D array
        int arr2D [][] = { {1,2,3} , {4,5,6}};

        //3D Array: contains 2D array
        int arr3D [][][] = { { {1,2,3} , {4,5,6} } , { {7,8,9},{10,11,12} } };

        //print 9
        System.out.println(arr3D[1][0][2]);//return value
        //print 2
        System.out.println(arr3D[0][0][1]);//return value
        //print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));//returns 1d array
        //print {10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));//return 1d array
        //print { {7,8,9} , {10,11,12} }
        System.out.println(Arrays.deepToString(arr3D[1]));//return 2d array
        System.out.println(Arrays.deepToString(arr3D));
    }
}
