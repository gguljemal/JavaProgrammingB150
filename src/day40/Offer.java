package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void displayInformation(){
        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                        + "Salary = " + salary + " $ | " + "isFullTime = " + isFullTime );
    }

    //write a method called turnToFullTime
    public void turnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        }else{
            System.out.println("Already Full time!!!");
        }
    }

    //write a method to change the location of the offer
    //to the location user passed

    public void changeLocation (String newLocation){
        location = newLocation;
    }
    //write a method to accept 4 parameters to change all info
    //about offers

 public void changeAllInfo(String newCompany, String newLocation,long newSalary, boolean newIsFullTime){
//or company = newCompany;
//   location= newLocation;
//    salary = newSalary
//    isFullTime = newIsFullTime

     System.out.println("Location = " + newLocation + " | " + "Company = " + newCompany + " | "
             + "Salary = " + newSalary + " $ | " + "isFullTime = " + newIsFullTime );
 }

 //    write a method to check the offer belong to 100K club
    public boolean offerIs100 (){
   //   salary>=100000 already generate a boolean result
        // so we can directly return that result
        return salary>=100000;
    }
    /* create an instance method called toString
    * no parameter
    * return String representation of Offer Object
    * in below format
    * [Location = Atlanta | Company = Apple | Salary = 140000 $ | isFullTime = true]
    */
    public String toString (){

        return "[ Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = " + salary + " $ | " + "isFullTime = " + isFullTime + " ]" ;
    }
    }

