package day23;

public class ArrayPractice {

    public static void main(String[] args) {

        //create an int array of 7 items
        //assign values
        //1,print out in reverse order
        //2,store last item in a variable called lastItem
                        //print it out separately
        //3, print the item right int the middle
        //optionally: find sum, find average, find max, find min

       int number [] = new int[7];

        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        number[5]=60;
        number[6]=70;

 //   or we can write:
 //     int number[] = {10,20,30,40,50,60,70};
 //     int number[] = new int[]{10,20,30,40,50,60,70};

        for (int i = number.length-1 ; i >=0  ; i--) {

            System.out.println(number[i]);
        }

    int arraySize = number.length;
    int lastIndex = arraySize-1;
    int lastValue = number[lastIndex];

            System.out.println("Last item in the array "+lastValue);

    int middleItem = arraySize/2;
        System.out.println("Middle item value "+number[middleItem]);

        int sum = 0;

        for (int i = 0; i <number.length ; i++) {

            int current = number[i];  //or we can do:
            sum=sum+current;          // sum=sum+num[i];
        }
        System.out.println("sum = " + sum);


}
}