// Royce Kok
// CSE 002
// 10/11/2014

// HW 06
/* This progrm will use the bisection method to compute the square roots of a 
user imput. Starting with two number, a high and a low, the program will then
test the difference between the two number and will use the middle as the new
high or the new low. End the program when the range is less than 0.000000 */

import java.util.Scanner;                             // Import scanner

public class Root{                                    // Declare a new class
    public static void main (String [] args){         // Declare main method
        
        // Declare the new scanner object
        Scanner myScanner;                            // Declare new scanner
        myScanner = new Scanner(System.in);           // Prompt the user for input
        System.out.print("Enter a double that is greater that one:   ");   
        
        if(myScanner.hasNextDouble()){
        double userInput = myScanner.nextDouble();     // Declare the new scanner input
            
            double low = 0;                           // Declare low     
            double high = userInput + 1;              // Declare high 
            double tolerance = 0.0000001;             // Declare tolerance
            double middle = (low + high)/ 2; 
            double middleSquare = middle * middle;    // Declare middle square
            double difference = Math.abs(middleSquare - userInput);           // Find the difference between both high and low
            
            while (difference > tolerance){           // Begining of new while loop
                
                middle = (low + high)/ 2;          // Declare new middle point
                
            
                if(middleSquare > userInput){         // If the middle square number is greater input
                    high = middle;                    // make the high number to middle
                } // End of the ig loop
            
                if(middleSquare < userInput){         // If the middle square number is less than user square
                    low = middle;                     // make the low number to middle
                } // End of the while loop
                
                middle = (low +high)/2;
                middleSquare = middle * middle; 
                
                difference = Math.abs(middleSquare- userInput);             // Compute the difference of the two
            
            } // End of while loop
            
            
            // Print it the end result
            System.out.println("The guess for square root of the value is " +middle+ ".");
        
        } // End of the if loop for having a double input
        
        else{
            System.out.println("You did not enter in a double.");
        }
        
        
        
        
    } // End of main method
} // End of public class 