/*
 * This is the BankAccount test class
 * to be used in Problem 2
 * You must add your code to this class
 * 
 * name: Amir Moradi
 * UNI: am6040
 */
public class BankTest{
  
  public static void main(String[] args)
  {
    //initiating an instance of a bank account
    BankAccount myAccount = new BankAccount("Amir",0);
    //making the deposits and withdraw
    myAccount.deposit(10000);
    myAccount.withdraw(600);
    myAccount.withdraw(200);
    //getting the current balance
    double currentBalance = myAccount.getBalance();
    System.out.println("the current balance is" + currentBalance);
  }

} //end of the class

