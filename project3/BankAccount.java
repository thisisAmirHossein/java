/*
 * This is the BankAccount class
 * to be used in Problem 2
 * You should not change this class
 *
 * name:
 * UNI:
 */
 public class BankAccount {

    private double balance;
    private String name;
    private int acctNumber;

    public BankAccount(String initName, int acct)
    {
        name=initName;
        acctNumber=acct;
        balance=0.0;
    }

    public void deposit(double amt)
    {
        balance=balance+amt;
    }

    public void withdraw(double amt)
    {
        balance=balance-amt;
    }

    public double getBalance()
    {
        return balance;
    }

} //end of the class
