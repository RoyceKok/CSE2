// CSE 002
// 10/19/2014

// Hw 07

/* For this lab use tree different ways to force the user to enter an 
integer between 1 and 9, inclusive, and then prints out display that 
depend on the value entered. 
*/

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 9 - ");
            int userInput = 0;
            
            if (myScanner.hasNextInt()) {
                userInput = myScanner.nextInt();
                
                System.out.println("Using for loops: ");
            
                if (userInput >= 1 && userInput <= 9) {
                    System.out.println("");
                
                 for (int k = 1; k <= userInput; k++){
                        for (int i = 0; i < k; i++) { // Rows
                                
                                // For loop for the spaces 
                                for (int space = userInput; space > k ; space--){
                                System.out.print(" ");  
                                }
                                
                                String str = "";
                                
                                for (int j = 0; j < k * 2 - 1; j++) { // Column
                                    str += k; 
                                } // End of the int j
                        
                                System.out.print(str);
                                System.out.println("");
        
                        } // End of for loop for int i
                        
                        
                            
                        for (int dash = 0; dash < k ; dash++) { // For loop for the amount of dash to print out
                                for (int space = userInput; space > k ; space--){
                                        System.out.print(" ");  
                                        }
                                
                                for (int dash2 =0; dash2 < k * 2 - 1; dash2++ ){
                                    System.out.print("-");
                                    dash++;
                                } // End of dash2 for loop        
                        } // End of dash for loop for the amount of dashes
                        
                    System.out.println("");
                 }
                    
                } // End of else statement for if integer is between 1 to 9


                    
                else {
                    System.out.println("You did not enter an integer between 1 and 9");

                } // End of the else loop


            }

            else {
                System.out.println("You did not enter an integer between 1 to 9");

            }

    

/////////////////////////////////////////////////////////////////////////////////
    System.out.println("");
    System.out.println("Using while loop: ");

    if (userInput >= 1 && userInput <= 9) {
                   
                   int k = userInput; 
                   int run = 1;
                   int space = k;
                   int vars = 1;
                   while (run <= k ){ 
                    
                        int row =1;
                        
                        while (row <= run ){ // While loop for row
                            space = k - vars;      
                              
                              // Code for the spaces to print out
                                while(space > 0 ){
                                    System.out.print(" "); 
                                    space--;
                                }
                             
                                  // Code for the columns to print out    
                                int columns = 1;
                                while (columns <= (2 * run - 1) ){ // While loop for columns
                              
                                    System.out.print(run);                            
                                    columns ++;
                                  }
                       
                            System.out.println(""); 
                            
                            row ++;
                             
                        }  
                    vars++;
                    run ++;        
                   }
                  
    }            
    else{
           System.out.println("You did not enter an integer between 1 to 9");
    } // end of the while loop for outside of the range

/////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("");
    System.out.println("Using do-while loop: ");
    
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
//////////////////////////////////////////////////////////////////////////////////////////                

        } // End of main method


} // End of public class
