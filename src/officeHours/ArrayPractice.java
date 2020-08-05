package officeHours;

public class ArrayPractice {

    public static void main(String[] args) {


        //1-write a program that can print out the unique  values from an int array
        //ex: arr--> {1,1,2,3,3} ===> output is 2

        int [] numbers = {1,1,2,2,3,4,4,5,5};  //expected result is --> 3
        int count =0;

        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i]==numbers[j]){
                    count++;
                }
                if (count==1){
                    System.out.println(numbers[j]);
            }
            }
        }
        //2-write a program that can print out the unique values from String Array

        String [] words = {"A","A","B","C","C","D","E"}; //Expected result : B

        for (int i = 0; i < words.length; i++) {
            int count2 = 0;
            for (int j = 0; j < words.length ; j++) {

                if (words[j].equals(words[i])){
                    count2++;
                }

                }if (count2==1){
                    System.out.println(words[i]);
            }
        }
//write a program that can find the second max number from an int array. DO NOT USE sort method

        int [] nums = {1,2,3,4,5,6,7,8,9};

        int max = nums[0];

        for (int num : nums){

            if (num > max){
                max = num;
            }
        }
        System.out.println("max = " + max);

        int max2 = nums[0];

        for (int num : nums){
            if (num == max){
                continue;
            }
            if (num>max2){
                max2 = num;
            }
        }
        System.out.println("max2 = " + max2);

       // 4- swap two variable values without using a temporary variable
        // ex:  if a=10, b=20;
        //  output: print (a)==>20
        //          print (b)==>10

        int [] scores = {30,50};
        int temp= scores [0];

        scores[0] = scores[1];
        scores [1] = scores[0];

        int a = 10, b = 20;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);











    }
}
