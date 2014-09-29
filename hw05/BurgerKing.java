// Royce Kok
///CSE 
// 09/26/2014

// Hw 05
/* A program that prompts the user to enter a choice of burger, a soda, or 
fries. Then, the program prompts the user for their detail choices. */

import java.util.Scanner;

public class BurgerKing{
    public static void main (String[] args){
        Scanner burgerKingScanner;
        burgerKingScanner = new Scanner(System.in);
        
        System.out.println("Enter a letter to indicate a choice of ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
       
       
       String initialOrder = burgerKingScanner.next();
       switch (initialOrder){ 
            case "B": 
            case "b":
                System.out.println("Enter A or a for all of the fixins.");
                System.out.println("Enter C or c for cheese.");
                System.out.println("Enter N or n for none of the above.");
                Scanner burgerScan;
                burgerScan = new Scanner(System.in);
                String burgerInput = burgerScan.next();
                    switch (burgerInput){
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
            
            case "S":
            case "s":
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)");
                Scanner drinkScan;
                drinkScan = new Scanner(System.in);
                String drinkInput = drinkScan.next();
                    switch (drinkInput){
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
            
            case "F":
            case "f":
                System.out.println("Do you want a large or small order of fries(l,L,s,or s)");
                Scanner friesScan;
                friesScan = new Scanner(System.in);
                String friesInput = friesScan.next();
                    switch (friesInput){
                        case "L":
                        case "l": System.out.println("You have order a large fries.");
                        return;
                        case "S":
                        case "s": System.out.println("You have order a small fries.");
                        break;
                    } // End of the switch statement for fries
                break; // Break after the user chooses his order
       
            default: System.out.println("You did not enter a valid input.");
            
       } // End of outer switch statement
        
       
        
    } // End of main method
    
} // End of public class