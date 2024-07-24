/*
*
*  your information here
*  name: Amir Moradi
*  UNI: am6040
*  The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
*/

import java.util.Scanner;

public class E1d{

  public static void main(String[] args){

    int sum=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number");
    int a = input.nextInt();

    System.out.print("Please enter another number");
    int b = input.nextInt();
    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer
    for(int i = a; i <= b; i++)
    {
      if(i%2 != 0)
      {
        System.out.println(i);
        sum = sum + i;
      }
    }

    System.out.println("The sum is: " + sum);

  }
}