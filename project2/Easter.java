/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: Amir Moradi am6040
 * @date: 01/31/2024
 */

import java.util.Scanner;

public class Easter{
  
    public static void main(String[] args){
        
        
        //defining the scanner and asking the user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt(); 
        String month = ""; 
        
        // your code here!
        int y = year;
        int a = y%19;
        int b = y/100;
        double c = y%100;
        int d = b/4;
        double e = b%4;
        int g = (8 * b + 13)/25;
        int h = (19 * b + 13)%25;
        int j = (int) c/4;
        double k = c%4;
        int m = (int) (a + 11 * h)/319;
        int r = (int) (2 * e + 2 * j - k - h + m + 32)%7;
        int n = (int) (h - m + r + 90)/25;
        int p = (int) (h - m + r + n + 19)%32;

        
        switch (n) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
            default: month = "Invalid month"; break;
        }

        System.out.println("Easter is on "+p+" of "+ month);


    }





}	
