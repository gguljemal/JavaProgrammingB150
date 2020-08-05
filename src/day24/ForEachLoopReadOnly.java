package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int num1 = 33;
        int num2 = num1;
        num2 = 30;

        System.out.println(num1);
        System.out.println(num2);

        long nums [] = {10, 40, 20};
//      how do i change double my first item in array
//      nums [0]=num[0]*2;   //nums[0]*=2
//      System.out.println (nums[0]);

        for (int x = 0; x < 3 ; x++) {

           long num = nums[x];
           num = 100;
 //      System.out.println(nums[x]*2); JUST PRINTING WONT CHANGE THE VALUE
            //nums[x] = nums[x] * 2;  //here we are doubling the value of each number
        }

        for (long num : nums) {

            num = 100;

            System.out.println(num);
        }

        System.out.println("AFTER WE MODIFY THE VALUE");

        for (int i = 0; i < 3 ; i++) {

            System.out.println(nums[i]);
        }
    }
}
