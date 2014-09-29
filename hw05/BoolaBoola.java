// Royce Kok
// CSE 002
// 09/27/2014

// Hw 05
/* This homework that has three boolean variables to each of which the value of 
true or false is randomly assigned. Then, combine these variables together with 
random choices of && and || */

import java.util.Scanner;                            // Import the scanner

public class BoolaBoola{                             // Declare the public class
    public static void main (String[] args){
    
    boolean random1 = true;                         // Variable declaration for random 1
    boolean random2 = true;                         // Variable declaration for random 2
    boolean random3 = true;                         // Variable declaration for random 3
    
   // Random generator boolean 1    
    int rand1 = (int) (Math.random()*2 +1 );        // Use math.random to generate value 1 or 2
    if (rand1 == 1){                                // If 1 then false, if 2 then true 
        random1 = true;                             
        System.out.println("The frist boolean is " +random1+ ".");
    }
    else if(rand1 == 2){
        random1 = false;
        System.out.println("The first boolean is  " +random1+ ".");
    }
    
    // Random generator boolean 2
    int rand2 = (int) (Math.random()*2 +1 );        // Do the same to generate random boolean 2
    if (rand2 == 1){
        random2 = true;
        System.out.println("The second boolean is " +random2+ ".");
    }
    else if(rand2 == 2){
        random2 = false;
        System.out.println("The second boolean is " +random2+ ".");
    }
    
    // Random generator boolean 3                   // Do the same to generate random boolean 3
    int rand3 = (int) (Math.random()*2 +1 );
    if (rand3 == 1){
        random3 = true;
        System.out.println("The third boolean is " +random3+ ".");
    }
    else if(rand3 == 2){
        random3 = false;
        System.out.println("The third boolean is " +random3+ ".");
    }
    
    
    /* At this point in the code, have three randomly generated boolean random
    variable. The next step is to randomly generate the four cases that could 
    be true with the different cases for && and || */
    
    
    
    int randomVariable = (int)(Math.random()*4 +1);         // Randomly generate 4 cases
    
    // Write switch statement for the following FOUR cases
    switch (randomVariable){
        case 1: boolean combine = random1 || random2 || random3;   // have the program test the output
                
                System.out.println("Does " +random1+ " || " +random2+ " || " +random3+ " have the value true of false");
                Scanner inputScan;                                     // Allow the user to answer
                inputScan = new Scanner(System.in);                    // Scan the user input
                String input = inputScan.next();                       // Declare the user input as input                
                boolean inputbool = true;                              // Change the user input from a string to a boolean and 
                                                                       // then arbitarily assign true or false value to initiate boolean 
                    if (input.equals("true") || input.equals("t")){    // If user enter "true" or "t" 
                        inputbool = true;                              // Then assign the boolean to be true
                        }
                    else if (input.equals("false") || input.equals("f")){  // If user enter "false" or "f"
                        inputbool = false;                                 // Then assign the boolean to be false
                        } 
                    else {                                                 // If the user didn't enter the right output, return
                        System.out.println("You did not input a correct input (true or false)");
                        return;
                    }
                
                        // Now check if the user input is correct or wrong by testing the user input to the computer answer
                        // If the computer's answer is the same with the user input then print out "correct".
                        // If the computer's answer is not the same with the user input then print out "Wrong; try again"
                        if (combine == inputbool){
                            System.out.println("Computer's answer is " +combine+ ". User's answer is " +inputbool+  " \n Correct"); 
                        }
                        else{
                            System.out.println("Computer's answer is " +combine+ ". User's answer is " +inputbool+ "\n Wrong; try again.");
                        }
                        break;
        
        // Write the same code for case 2- case 4 using the same logic as describe in case 1 in the comments
        case 2: boolean combine2 = random1 || random2 && random3;
             
                System.out.println("Does " +random1+ " || " +random2+ " && " +random3+ " have the value true of false");
                    Scanner inputScan2;
                    inputScan2 = new Scanner(System.in);
                    String input2 = inputScan2.next();
                    boolean inputbool2 = true;
                        if (input2.equals("true") || input2.equals("t")){
                        inputbool2 = true; 
                        }
                        else if (input2.equals("false") || input2.equals("f")){
                        inputbool2 = false;   
                        } 
                        else {
                            System.out.println("You did not input a correct input (true or false)");
                            return;
                        }
                        
                            if (combine2 == inputbool2){
                                System.out.println("Computer's answer is " +combine2+ ". User's answer is " +inputbool2+  "\n Correct"); 
                            }
                            else{
                                System.out.println("Computer's answer is " +combine2+ ". User's answer is " +inputbool2+ "\n Wrong; try again.");
                            }
                            break;
            
            
        case 3: boolean combine3 = random1 && random2 || random3;
             
                 System.out.println("Does " +random1+ " && " +random2+ " || " +random3+ " have the value true of false");
                    Scanner inputScan3;
                    inputScan3 = new Scanner(System.in);
                    String input3 = inputScan3.next();
                    boolean inputbool3 = true;
                        if (input3.equals("true") || input3.equals("t")){
                        inputbool3 = true; 
                        }
                        else if(input3.equals("false") || input3.equals("f")){
                        inputbool3 = false;   
                        } 
                        else {
                            System.out.println("You did not input a correct input (true or false)");
                            return;
                        }
                        
                    
                        if (combine3 == inputbool3){
                            System.out.println("Computer's answer is " +combine3+ ". User's answer is " +inputbool3+  "\n Correct"); 
                        }
                        else{
                            System.out.println("Computer's answer is " +combine3+ ". User's answer is " +inputbool3+ "\n  Wrong; try again.");
                        }
                        
                        break;
        
        case 4: boolean combine4 = random1 && random2 && random3;
             
                  System.out.println("Does " +random1+ " && " +random2+ " && " +random3+ " have the value true of false");
                    Scanner inputScan4;
                    inputScan4 = new Scanner(System.in);
                    String input4 = inputScan4.next();
                    boolean inputbool4 = true;
                        if (input4.equals("true") || input4.equals("t")){
                        inputbool4 = true; 
                        }
                        else if (input4.equals("false") || input4.equals("f")){
                        inputbool4 = false;   
                        }
                        else {
                            System.out.println("You did not input a correct input (true or false)");
                            return;
                        }
                            
                        if (combine4 == inputbool4){
                            System.out.println("Computer's answer is " +combine4+ ". User's answer is " +inputbool4+  "\n Correct"); 
                        }
                        else{
                            System.out.println("Computer's answer is " +combine4+ ". User's answer is " +inputbool4+ "\n Wrong; try again.");
                        }
        
                        break;
    } // End of 4 switch cases
    } // End of main method
    
} //End of public class