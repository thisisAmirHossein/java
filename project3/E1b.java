/*
*
*  your information here
* name: Amir Moradi
* UNI: am6040
*/

import java.util.Scanner;

public class E1b{

  public static void main(String[] args){

    int sum=0;

    // your code here 
    // you should compute the sum as directed 
    // use the variable sum for your answer
    for(int i = 1; i <=100; i++)
    {
      System.out.println(i);
      System.out.println(i*i);
      sum = sum + (i*i);
      System.out.println(sum);
    }


    System.out.println("The sum is: " + sum);

  }
}