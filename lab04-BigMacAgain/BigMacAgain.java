// Royce Kok
// CSE 002
//09/19/2014

// Lab 04
/*Program that uses the Scanner class to obtain from users how many Big Macs 
that they want and whether they want an order of fries. The code will print out
the total cost of the meal*/

// Cost of Big Mac is $2.22 
// Cost of fries is $ 2.15

import java.util.Scanner;

public class BigMacAgain{
    public static void main (String[] args){    
    
    // Declare the scanner object
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    System.out.print("Enter the number of Big Macs (an integer>0): ");
    

    int nBigMacs; 
    double costofBigMac = 2.22;
    double totalCostOfBigMac;
    double costOfFries$ = 2.15;
    
    // Chceck if the user enter an integer for the number of Big Macs
    if(myScanner.hasNextInt()){
            nBigMacs = myScanner.nextInt();
        
            if(nBigMacs>0){
                totalCostOfBigMac = nBigMacs*costofBigMac;
                double totalCostOfBigMac2 = (int)(totalCostOfBigMac *100)/100.00; 
              System.out.println("Total cost of Big Macs is " +totalCostOfBigMac2+ ".");  
            }
            else{
                System.out.print("You did not enter an int >0.");
                return;
            }
    }
    else{
        System.out.println("You did not enter an int.");
        return;             // leaves the program, i.e. the program terminates
        }  // end of if-else statement for number of Big Macs
    
    // Ask the user if he want fries
    System.out.print("Do you want an order of fries (Y/y/N/n):  ");
    
            if(myScanner.hasNext()){
            String fries = myScanner.next();
            
            if(fries.equals("Y") || fries.equals("y")) {
                totalCostOfBigMac = nBigMacs*costofBigMac;
                double totalCostOfBill = totalCostOfBigMac + costOfFries$;
                double totalCostOfBill2 = (int)(totalCostOfBill *100)/100.00;
                System.out.println ("You ordered fries at the cost of $2.15");
                System.out.println ("The total cost of the meal is " +totalCostOfBill2+ ".");
            }
            else if(fries.equals("N") || fries.equals("n")) {
                totalCostOfBigMac = nBigMacs*costofBigMac;
                double totalCostOfBill = totalCostOfBigMac;
                double totalCostOfBill2 = (int)(totalCostOfBill *100)/100.00;
                System.out.println("The total cost of the meal is " +totalCostOfBill2+ ".");
            }
            else{
                System.out.println("You did not enter a correct input for fries.");
                return;
            }
        
    } // end of the if statement for order of fries
    
    
    
    } // end of main method
}  // end of public class

