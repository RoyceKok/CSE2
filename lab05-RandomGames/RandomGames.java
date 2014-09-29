// Royce Kok
// CSE 002
// 09/25/2014

// Lab 05
/* This lab session is an exercise of using switch statements and in 
using Math.random(), a random number generator */

// Let the user to choose from 3 games
// Roulette ("R"/ "r")
// Craps ("C"/"c")
// Picking a card from a deck of playing cards ("P"/ "p")

import java.util.Scanner;

public class RandomGames{
    public static void main (String[] args){
        
        // Declare the new scanner object
        Scanner gameScanner; 
        gameScanner = new Scanner (System.in);
        System.out.print("Enter R or r for Roulette; C or c for craps; Por p for pick a card game -");
        
        // Check if the scanner object have the required input
        if(gameScanner.hasNext()){
        String gameInput = gameScanner.next();
        
            if(gameInput.equals("R") || gameInput.equals("r")) {
               
               //int roul = (int)(Math.random()*2)+1; 
                int roul = (int) (Math.random()*38);
                    if(roul == 37){
                        System.out.println("Roulette is 00"); 
                    }  
                    else{
                        System.out.println("Roulette " +roul+ ".");
                    }    
                // How to get it to have a random of "00"?
                return; 
            }  // End of if statement for R and r
            
            else if(gameInput.equals("C") || gameInput.equals("c")){
                int carp1 = (int)(Math.random()*7);
                int carp2 = (int)(Math.random()*7);
                int sumCarp = carp1 + carp2;
                System.out.println("Carps: " +carp1+ " + " +carp2+ " = " +sumCarp+ ".");
                return;
            } // End of if statement for C and c
            
            else if(gameInput.equals("P") || gameInput.equals("p")){
                
                int suit1 = (int)(Math.random()*9)+1;
                int suit2 = (int)(Math.random()*4)+1;
                    if(suit2 == 1){
                        System.out.println(suit1 +" of Hearts.");
                    }
                    else if(suit2 == 2){
                        System.out.println(suit1 + " of Diamonds.");
                    }
                    else if(suit2 == 3){
                        System.out.println(suit1 + " of Spades.");
                    }
                    else if (suit2 == 4){
                        System.out.println(suit1 + " of Clubs.");
                    }
                
            } // End of if statement for P or p
            
            else{
                System.out.println("A single character expected");
            }
            
        } // End of the if statement for if the input is correct
        
        else{
            System.out.println("You did not enter a string");
        } // End of else statment for error code 
        
        
    } // End of main method
    
} // End of public class