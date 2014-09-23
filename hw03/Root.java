// Royce Kok
// CSE 002
// 9/14/2014

// Program is supposed to prompt the user to enter  a double
// Then, prints out a crude estimate of the cube root of the number
// And the value of this crude guess when cubed

import java.util.Scanner;
    
    public class Root {
        
        public static void main (String [] args){
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            // Prompt the user to enter the input
            System.out.print ("Enter a double: ");
            
            // Declaring the input as a double
            double x = myScanner.nextDouble ();
            
            // Declare the guesses and formula for the crude estimate for the cube root
            double guess = x/3;
            double guess2 = (guess*guess*guess+x)/ (3*guess*guess);
            double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
            double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
            double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
            
            // Print out the cube root
            System.out.println ("The cube root is " +guess5+ ".");
            
            double Y;       // Declaring the variable for the estimate ^3
           
           // Formula for the guess ^3
            Y = guess5*guess5*guess5;
           
           // Print out the number
            System.out.println ("The cube of the estimate is " +Y+ ".");
            
            
        } // end of main method
    } // end of public class