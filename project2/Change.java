/**
 * This program determines how to give change to a customer
 * who provides a price and amount paid.
 * 
 * @author: Amir Moradi am6040
 * @date: 01/31/2024
 */

import java.util.Scanner;

public class Change{
  
    public static void main(String[] args){

        // your code here!
        //defining the scanner and asking the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount due in pennies: ");
        int amountDue = input.nextInt();

        System.out.print("Enter the amount received in pennies: ");
        int amountReceived = input.nextInt();

        // calculating the amount of change to be refunded  
        int changeDue = amountReceived - amountDue;

        int dollars = changeDue / 100;
        changeDue %= 100;

        int quarters = changeDue / 25;
        changeDue %= 25;

        int dimes = changeDue / 10;
        changeDue %= 10;

        int nickels = changeDue / 5;
        changeDue %= 5;


        System.out.print("the customer should receive "+ dollars+ " dollors "+quarters+" quarters "+dimes+" dimes "+nickels+"nickels and " + changeDue +" pennies ");

    }

}	