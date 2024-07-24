/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * 
 * @author: Amir Hossein Moradi am6040
 * @date: 01/31/2024
 */

import java.util.Scanner;

public class Minutes{
    
    public static void main(String[] args){
        
        //defining the Scanner object
        Scanner input = new Scanner(System.in);
        
        //asking the user for their name
        System.out.println("What is your name?");
        String name = input.nextLine();

        //taking the user input for a number of days
        System.out.println("Please enter a number of days "+name);
        int days = input.nextInt();

        //taking the user input for a number of weeks
        System.out.println("And a number of weeks please");
        int weeks = input.nextInt();

        // calculations (every day is 24 x 60 = 1,440 minutes and every week is 7 x 1,440 = 10,080 minutes)        
        //convert days to minutes
        int daysToMinutes = days * 1440; 

        
        //convert weeks to minutes by first converting the number of weeks to days and then multiplying that by the number of minutes in every week
        int weeksToDays = weeks*7;
        int weeksToMinutes = weeksToDays * 1440;

        System.out.println("You have entered "+days+" days which is "+daysToMinutes+" and "+weeks+" weeks which is "+weeksToMinutes+" minutes");

    }
}
 