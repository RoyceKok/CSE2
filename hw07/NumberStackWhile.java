// CSE 002
// 10/19/2014

// Hw 07

/* For this lab use tree different ways to force the user to enter an 
integer between 1 and 9, inclusive, and then prints out display that 
depend on the value entered. 
*/

import java.util.Scanner;
public class NumberStackWhile {
    public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 9 - ");
            if (myScanner.hasNextInt()) {
                int userInput = myScanner.nextInt();

                while (userInput >= 1 && userInput <= 9) {
                   
                   int k = userInput; 
                   int run = 1;
                   int space = k;
                   int vars = 1;
                   while (run <= k ){ 
                    
                        int row =1;
                        int columns = 1;
                        while (row <= run ){ // While loop for row
                            space = k - vars;      
                            
                            while (columns <= (2* run - 1)) {
                                System.out.print("-");  
                                    // Code for the spaces to print out
                                while(space > 0 ){
                                    System.out.print(" "); 
                                    space--;
                                }
                             
                                  // Code for the columns to print out    
                                
                                while (columns <= (2 * run - 1)) { // While loop for columns
                              
                                    System.out.print(run);                            
                                    columns ++;
                                  }
                                
                                
                       
                            System.out.println(""); 
                            
                            row ++;
                             
                            
                            columns++; 
                            } 
                        }  
                    vars++;
                    run ++; 
                    System.out.println("");
                   }
                 break;    
                } // end of the while loop for between 1 to 9 
                
                while (userInput < 1 && userInput > 9 ){
                System.out.println("You did not enter an integer between 1 to 9");
                } // end of the while loop for outside of the range
            
                
            } // End of if the scanner has the next Int
            
        } // End of main method


} // End of public class