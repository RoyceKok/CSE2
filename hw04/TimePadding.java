// Royce Kok
// CSE 002
// 09/19/2014

// Hw04 - Time Padding
/* The program will prompt the user to input an integer giving the 
number of time in seconds and then the code will display the code in 
conventional form */

import java.util.Scanner;

public class TimePadding{
    public static void main (String[] args){
        
        // Declare my scanner object
        Scanner timeScan;
        timeScan = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        
        if(timeScan.hasNextInt()){
            int timeInput = timeScan.nextInt();
            
                if(timeInput <= 60){
                    int sec = timeInput;
                    System.out.println("The time is 00:00:" +sec+ ".");
                }
                else if (timeInput > 60 && timeInput <= 3600){
                    int min = timeInput / 60;
                    int secRemainder = timeInput - (min*60);
                    System.out.println("The time is 00:" +min+ ":" +secRemainder+ ".");
                }
                else if (timeInput > 3600){
                    int hour = timeInput / 3600;
                    int minRemainder = timeInput -(hour*3600);
                    int minRemainderPrnt = minRemainder/60;
                    int secRemainder = timeInput - (hour*3600) - (minRemainderPrnt*60);
                    System.out.println("The time is " +hour + ":" +minRemainderPrnt + ":" +secRemainder+ ".");
                }
        } // end of the if statement
        else{
            System.out.println("You did not enter an integer input. ");
            return;
        } // enf of the else statement 
        
    } // End of main method
    
    
} // End of public class
