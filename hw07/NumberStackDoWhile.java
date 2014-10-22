// CSE 002
// 10/19/2014

// Hw 07

/* For this lab use tree different ways to force the user to enter an 
integer between 1 and 9, inclusive, and then prints out display that 
depend on the value entered. 
*/
import java.util.Scanner;

public class NumberStackDoWhile{
    public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 9 - ");
            if (myScanner.hasNextInt()) {
                int userInput = myScanner.nextInt();
                
                if (userInput >= 1 && userInput <=9) {            // Do while loop for the user input
                   int k = userInput; 
                   int run = 1;
                   int space = k;
                   
                    do{       // Do while loop - increments run, prints each number block
                        int row = 1; 
                        do{ // Do while loop - increments row, prints each row within the block
                            space = k - run;
                            do{   // Do while loop - increment spaces, prints spaces within row
                                System.out.print(" "); 
                                space--;
                            }while(space >= 0);
                     
                            int columns = 1;
                            
                            do{   // Do while loop- increments columns, prints the number in each column
                                System.out.print(run); 
                                columns ++;
                            }while(columns <= (2 * run - 1));
                            
                            System.out.println("");
                            row ++;  
                            
                        }while(row <= run);
                        
                        int columns1 = 1; 
                        
                        space = k - run;
                        do{   // Do while loop - increment spaces, prints spaces within row
                                System.out.print(" "); 
                                space--;
                        }while(space >= 0);
                    
                        do{
                            System.out.print("-"); 
                            columns1 ++; 
                        }while(columns1 <= (2*run - 1)); 
                        
                        System.out.println("");
                        
                        run ++;    
                    }while (run <= k ); // end of while for the number is still less than user input
                   
                    
            
                } //end of user input
                
                else{
                    System.out.println ("You did not enter the corect integer.");
                }
                
          
            } // End of if the scanner has the next Int
            
        } // End of main method


} // End of public class    