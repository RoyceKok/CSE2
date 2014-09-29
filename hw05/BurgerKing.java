// Royce Kok
///CSE 
// 09/26/2014

// Hw 05
/* A program that prompts the user to enter a choice of burger, a soda, or 
fries. Then, the program prompts the user for their detail choices. */

import java.util.Scanner;                               // Import scanner 

public class BurgerKing{                                // Public class
    public static void main (String[] args){            // Main method
        Scanner burgerKingScanner;                      // Declare scanner
        burgerKingScanner = new Scanner(System.in);     // Recieve input from user
        
        System.out.println("Enter a letter to indicate a choice of ");          // Ask user what they would like to purchase
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
       
       
       String initialOrder = burgerKingScanner.next();  // Declare the user input as a string
       switch (initialOrder){                           // Use switch statements
            case "B":                                   // List the statements for case B or b (burger)
            case "b":
                System.out.println("Enter A or a for all of the fixins.");  // Ask user what he would like on his burger
                System.out.println("Enter C or c for cheese.");
                System.out.println("Enter N or n for none of the above.");
                Scanner burgerScan;                     // Declare a new scanner for burger
                burgerScan = new Scanner(System.in);    // Recieve input for new scanner
                String burgerInput = burgerScan.next(); // Declare the user input as a string
                    switch (burgerInput){               // Use switch statement for all possibilities of the fixins
                        case "A": 
                        case "a": System.out.println("You order a burger with all fixins.");
                        break;
                        case "C":
                        case "c": System.out.println("You order a burger with Cheese.");
                        break;
                        case "N": 
                        case "n": System.out.println("You order a burger with Non or the above.");
                        break;
                        } // End of switch statements for burger
            break; // Break after the user chooses his order
            
            case "S":                                   // List the statements for case S or s (Soda)
            case "s":
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)");
                                                        // Ask user what drinks he would like
                Scanner drinkScan;                      // Declare a new scanner for drinks
                drinkScan = new Scanner(System.in);     // Recieve input from the user
                String drinkInput = drinkScan.next();   // Declare the user input as a string
                    switch (drinkInput){                // Use switch statement for all possibilities of the drinks
                        case "P":
                        case "p": System.out.println("You have order Pepsi.");
                        break;
                        case "C":
                        case "c": System.out.println("You hav order Coke.");
                        break;
                        case "S":
                        case "s": System.out.println("You have order Sprite.");
                        break;
                        case "M":
                        case "m": System.out.println("You have order Mountain Dew");
                        break;
                    } // End of switch statements for drinks 
            break; // Break after the user chooses his order
            
            case "F":                                   // List the statements for case F or f (Fries)
            case "f":
                System.out.println("Do you want a large or small order of fries(l,L,s,or s)");
                                                        // Ask user what size of fries he would like
                Scanner friesScan;                      // Declare a new scanner for fries
                friesScan = new Scanner(System.in);     // Recieve input from the user
                String friesInput = friesScan.next();   // Declare the user input as a string
                    switch (friesInput){                // Use switch statement for all possibilities of the size of fries
                        case "L":
                        case "l": System.out.println("You have order a large fries.");
                        return;
                        case "S":
                        case "s": System.out.println("You have order a small fries.");
                        break;
                    } // End of the switch statement for fries
                break; // Break after the user chooses his order
       
            default: System.out.println("You did not enter a valid input."); // Use default statement to capture all the other possibilities
            
       } // End of outer switch statement
        
       
        
    } // End of main method
    
} // End of public class