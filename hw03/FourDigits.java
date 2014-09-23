// Royce Kok
// CSE 002
// 9/13/2014

// A program that prompt the user to enter a double and then print out the
// four digits to the right of the decimal point. 

// Cast the number to an interger twice, once before and once after multiplication by 10000

import java.util.Scanner;

public class FourDigits {
    
    public static void main (String [] args){
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double input1 = myScanner.nextDouble ();  // declare the variable
        int display2;                             // declare the variable for value to the left of decimal point
        double fourdigit;                         // declare the variable for value to the righ of decimal 
        
        // Casting 
        display2 = (int)(input1);
        int prod = (int)(input1*10000);
        //System.out.println(prod);
        
        // declare the intger and modulate it for single, two, three and four digits
        //int singledigit = prod%10;
        //int twodigits = prod%100; 
        //int threedigits = prod&1000;
        int fourdigits = prod%10000;
        
        // Print out the four digit value
        //System.out.print ("The four digit value is " +singledigit+ +twodigits+ +threedigits+ +fourdigits+ ".");
        System.out.println ("The four digit value is " +fourdigits+ ".");
        
        
    } // end of main method

} // end of public class
