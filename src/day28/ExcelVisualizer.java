package day28;

public class ExcelVisualizer {

    public static void main(String[] args) {


/*   Cell(1,1)=78      Cell(1,2)=54        Cell(1,3)=100     Cell(1,4)=84
     Cell(2,1)=33      Cell(2,2)=44        Cell(2,3)=77      Cell(2,4)=123
     Cell(3,1)=12      Cell(3,2)=88        Cell(3,3)=52      Cell(3,4)=76
     Cell(4,1)=67      Cell(4,2)=33        Cell(4,3)=98      Cell(4,4)=67
     Cell(5,1)=12      Cell(5,2)=88        Cell(5,3)=52      Cell(5,4)=45
     Cell(6,1)=67      Cell(6,2)=33        Cell(6,3)=98      Cell(6,4)=34

     {  {78,54,100,84} , {33,44,77,123} , {12,88,52,76} , {67,33,98,67} , {12,88,52,45} , {67,33,98,34}  }
 */

        int row1 [] = {78,54,100,84};
        int row2 [] = {33,44,77,123};
        int row3 [] = {12,88,52,76};
        int row4 [] = {67,33,98,67};
        int row5 [] = {12,88,52,45};
        int row6 [] = {67,33,98,34};

        int [] [] sheets = {row1,row2,row3,row4,row5, row6};

        int myExcel [] [] = { {20,27} , {87,99,100} , {90,45} };

        //tell me hot to print 100 and 90 from this array
        System.out.println(myExcel[1][2]);//--->100
        System.out.println(myExcel[2][0]);//--->90

        //in this 2d array object, we have 3 1D array object stored
        System.out.println(myExcel.length);

        System.out.println(myExcel[0].length);//--> 1arrays length
        System.out.println(myExcel[1].length);//--> 2arrays length
        System.out.println(myExcel[2].length);//--> 3arrays length

        //how can I make above code better by loop an dget the item count of each 1d array
        for (int i = 0; i < myExcel.length ; i++) {
            System.out.println("Item number "+i+" length is: "+myExcel[i].length);
        }

    }
}
