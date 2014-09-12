// Royce Kok
// 9/12/2014
// CSE2


// Lab 0
// Big Mac Java Program
// This program will obtain from user how many Big Macs, the cost of Big Macs, and the percentage for sales tax.
// The program then adds them together and display the total cost. 


import java.util.Scanner;

// First, we import the scanner class
// Then ....
// Lastly .....

public class BigMac{
    // main method required for every Java program
    public static void main (String [] args){
     
     
     // Declare the scanner object
     Scanner myScanner;
     // Tell scanner that you are creating an instant that will take input from STDIN
     myScanner = new Scanner ( System.in );
     // Prompt the user to type in the number of Big Macs
     System.out.print("Enter the number of Big Macs (an integer > 0): ");
     int nBigMacs = myScanner.nextInt ();
     
     
     // now prompt the user to input the cost Big Mac and the percent sales tax
     System.out.print("Enter the cost per Big Mac as" + "a double(in the form of xx.xx): ");
     Double bigMac$ = myScanner.nextDouble();
     System.out.print("Enter the percent tax as a whole number (xx): ");
     Double taxRate = myScanner.nextDouble();
     //convert tax rate into a proportion
     taxRate /= 100;  
    
    
    double cost$;
        int dollars,   //whole dollar amount of cost 
            dimes, pennies; //for storing digits
                //to the right of the decimal point 
                //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $"+bigMac$+ " per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"  +dollars+ "." +dimes+pennies) ;

    } // end of main method
    
    
}
