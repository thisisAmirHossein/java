/*
*
*  your information here
* name: Amir Moradi
* UNI: am6040
*/

import java.util.Scanner;

public class E1a{

  public static void main(String[] args){

    int sum=0;

    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer
    for(int i = 2; i <= 100; i = i+2)
    {
      System.out.println(i);
      sum = sum + i;
      System.out.println(sum);
    }

    System.out.println("The sum is: " + sum);

  }
}