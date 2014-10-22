// CSE 002
// 10/19/2014

// Hw 07

/* For this lab use tree different ways to force the user to enter an 
integer between 1 and 9, inclusive, and then prints out display that 
depend on the value entered. 
*/

import java.util.Scanner;

public class NumberStack2 {
    public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 9 - ");
            if (myScanner.hasNextInt()) {
                int userInput = myScanner.nextInt();

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

        } // End of main method


} // End of public class
