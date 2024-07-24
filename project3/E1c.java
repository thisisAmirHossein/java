/*
*
*  your information here
* name: Amir Moradi
* UNI: am6040
*/

import java.util.Scanner;

public class E1c{

  public static void main(String[] args){

    int result=0;

    // your code here 
    // you should compute and print the result here
    // use and update the variable result for each output
    for(int i = 0; i < 21; i++)
    { 
      System.out.println(i);
      result = (int) Math.pow(2,i);
      System.out.println(result);
    }

  }
}