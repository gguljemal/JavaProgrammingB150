package day40;

public class BankAccount {

          String accountType;
          String accountHolder;
          long accountNumber;
          double balance;

     // setAllValue
    public void setAllValue(String newAccountType, String newAccountHolder,
                            long newAccountNumber,double newBalance){
         accountType = newAccountType;
         accountHolder = newAccountHolder;
         accountNumber = newAccountNumber;
         balance = newBalance;
    }

     //showAccountBalance
    public void showAccountBalance(){
        System.out.println("current balance = " + balance);
    }


    // showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println(  "account holder is " + accountHolder + "accountType = " + accountType);
    }


    //getBalance return the balance
    public double getBalance(){
        return balance;
    }


    // deposit(amount)
    public void deposit(double amount){
        balance = balance + amount;
    }


    // withdraw (amount)
    public void withdraw(double amount){
        balance = balance - amount;
    }


    // withdraw100Cash()
    public void withdraw100Cash(){
        withdraw(100);
    }


    //purchaseProduct(productPrice, count )
    public void purchaseProduct(double productPrice, int count ){
        double totalPrice = productPrice * count;
        balance = totalPrice;

        //OR withdraw(totalPrise)
    }


    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
