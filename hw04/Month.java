// Royce Kok
// CSE 002
// 09/19/2014

// HW04 - Month 
/* This program will ask the user to input an integer for the month
and then the program will lt you know how many days are in the month
if it is the month of Feb, then ask what year it is. */

import java.util.Scanner;

public class Month{
    public static void main (String [] args){ 
    // Declare the scanner object
         Scanner myScanner;
            myScanner = new Scanner (System.in);
        System.out.print ("Enter an int giving the number of the month (1-12) - ");
        
        // Start the conditional statements
        if(myScanner.hasNextInt()) {
            int month = myScanner.nextInt();
            
            if (month >= 1 && month <=12){
                if (month == 1 || month == 3 || month == 5|| month == 7|| month ==8|| month == 10 || month ==12){
                    System.out.println("The month has 31 days. ");
                } // end of the if statement for month - 31 days
                
                else if (month == 4|| month ==6|| month == 9|| month ==11){
                    System.out.println("The month has 30 days. ");
                } // end of the else statement for month - 30 days
                
                else if (month == 2){
                        System.out.print("Enter an int giving the year- ");
                    
                        if(myScanner.hasNextInt()) {
                            int year = myScanner.nextInt();
                            double yeardiv4 = year %4;
                            double yeardiv100 = year %100;
                            double yeardiv400 = year %400;
                            
                                if (yeardiv4 == 0 && yeardiv100 == 0 && yeardiv400 == 0){
                                    System.out.println("The month has 29 days.");
                                }// end of if statement for evenly divisible by 4
                                else {
                                    System.out.println ("The month has 28 days.");
                                } // end of condition that are not div by 4, 100 and 400
                        } // end of the if statement for the Feb 
                        
                        else{
                            System.out.println("You did not input a valid year.");
                            return;
                        }
                } // end of the else if statement to check the month of Feb
                
            }
            else {   // else statement for invalid months of the year
                    System.out.println("You did not enter an int between (1-12).");
                } // End of the else statement that you did not enter an int for month 1-12
            } // End of the statement for all the condition of an integer 
            
        else {
            System.out.println(" You did not input an integer");
        } // End of the if conditional statement
    
    } // End of main method
    
} // End of public class