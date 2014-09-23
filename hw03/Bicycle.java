// Royce Kok
// CSE 002
// 09/13/2014

// Write a program that prompts the user to enter two digit.
// 1st digit, number of counts on a cyclometer
// 2nd digit, number of seconds during which counts occurred
// Then print out the the distance traveled and the average miles per hour.

import java.util.Scanner; // Import

public class Bicycle {
    
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in ); // construct
        
        // Prompt the user to enter the numbr seconds
        System.out.print("Enter the number of seconds (an integer > 0): ");
        int nSeconds = myScanner.nextInt ();
        
        // Prompt the user to enter the number of counts on a cyclometer
        System.out.print("Enter the number of counts (an integer >0): ");
        int nCounts = myScanner.nextInt ();
        
        double PI = 3.14159;                   // The value for pie is PI and the numeric value for pie is 3.14159 
        int feetPerMile = 5280;                // The coversion for feet to mile; there is 5280 feet to 1 mile 
        int inchesPerFoot = 12;                // The conversion for inches to feet; there is 12 inches in a foot 
        int secondsPerMinute = 60;             // The conversion for seconds to minute; there is 60 seconds in a minute 
        
        double distanceTrip1;              // Declaring the variable for Distance Trip 1
        double totalDistance;              // Declaring the variable for Total Distance
        double  wheelDiameter = 27.0;      // The wheel diameter 
        double minutes;                    // Declaring the minute from seconds counter 
        double milesPerHour;               // Declaring the variable for miles per hour
        
        distanceTrip1 = nCounts* wheelDiameter * PI / inchesPerFoot/ feetPerMile;    // Calculation for the distance of the trip
        minutes = nSeconds/secondsPerMinute;                                               // Conversion to minutes  
        milesPerHour = distanceTrip1/(minutes/60);
        
        distanceTrip1 = (int)(distanceTrip1*100)/100.00;         // Casting to make distance to two variable
        minutes = (int)(minutes*100)/100.00;                     // Casting to make minutes to two variable
        milesPerHour = (int)(milesPerHour*100)/100.00;           // Casting to make MPH to two variable
        
        // Print out the code
        System.out.println("The distance was " +distanceTrip1+ " miles and " +minutes+ " minutes.");
        System.out.println("The average mph was " +milesPerHour+ ".");
        
    } // end of main method
} // end of public class
