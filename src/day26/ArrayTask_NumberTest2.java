package day26;

public class ArrayTask_NumberTest2 {

    public static void main(String[] args) {

    //given an int array
    //write a program to test all the element in an int array more than 100 or not

    int scores [] = {156,101,76,187,87,110};

    String finalResult="";
    //LOGIC2:
    //take each item check if it is MORE than 100 count
    //in the end if count is equal to array item count the finalResult YES , answer is NO

    int cntMoreThan100 = 0;

        for (int num : scores){

            if(num>100){
                cntMoreThan100++;
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if (cntMoreThan100==scores.length){
            finalResult="YES";
        }else {
            finalResult="NO";
        }
        System.out.println("finalResult = " + finalResult);


}
}
