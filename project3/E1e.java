/*
*  your information here
*  name: Amir Moradi
*  UNI: am6040
*  The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
*/

import java.util.Scanner;

public class E1e{

  public static void main(String[] args){

    int sum=0;

    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number");
    int a = input.nextInt();

    while (a != 0) {
      // Extract the last digit
      int digit = a % 10;
      // Check if the extracted digit is odd and adding it to the sum
      if(digit%2 != 0)
      {
        System.out.println(digit);
        sum = sum + digit;
      }
      // Remove the last digit from the number
      a /= 10;
    }
    System.out.println("The sum is: " + sum); 
  }     
}