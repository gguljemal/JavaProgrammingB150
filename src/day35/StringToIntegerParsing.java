package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {

         //I have a employee ID : "FB-457"
        //give me the employee number and store it into a number

     String strNum = "100";
     int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";
        //int id = Integer.parseInt(empID);
      // System.out.println("id = " + id);---->>result will show error, it does not contain only numbers
        //we should have only numbers

        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println("id = " + id);

        //I have a String called twoNumbers
        String twoNumbers = "100,600";
        //I want you to add them and give the result

        int numbers = Integer.parseInt(twoNumbers.split(",")[0])+
                Integer.parseInt(twoNumbers.split(",")[1]);

        System.out.println(numbers);
    }
}
