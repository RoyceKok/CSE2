// Royce Kok
// CSE 002
// 10/11/2014

// HW 06
/* This progrm will use the bisection method to compute the square roots of a 
user imput. Starting with two number, a high and a low, the program will then
test the difference between the two number and will use the middle as the new
high or the new low. End the program when the range is less than 0.000000 */

import java.util.Scanner; 

public class Root{
    public static void main (String [] args){
        
        // Declare the new scanner object
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter a double that is greater that one:   ");
        
        if(myScanner.hasNextDouble()){
        double userInput = myScanner.nextDouble();    
            
            double low = 0;
            double high = userInput + 1;
            double tolerance = 0.0000001;
            double difference = high - low; 
            
            while (difference > tolerance){
                
                double middle = (low + high)/ 2;
                double middleSquare = middle * middle;
            
                if(middleSquare > userInput){
                    high = middle;
                } // End of the ig loop
            
                if(middleSquare < userInput){
                    low = middle;
                } // End of the while loop
                
                difference = (high-low); 
            
            } // End of while loop
            
            System.out.println("The high of the value is " +high+ ".");
            System.out.println("The low of the value is " +low+ ".");
        } // End of the if loop for having a double input
        
        else{
            System.out.println("You did not enter in a double.");
        }
        
        
        
        
    } // End of main method
} // End of public class 