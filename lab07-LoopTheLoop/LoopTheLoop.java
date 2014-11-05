// Royce Kok
// CSE 002
// 10/10/2014

// Lab 07
/* For this lab session, we will write while loop and use a break statemtent. 
 */

// For the first assignment, use nStar as a sentinel, declare a second variable 
// to control the loop

import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String[] args) {


            int inputStar = 1, nStar = 10;

            while (inputStar <= nStar) {
                System.out.print("*");
                inputStar++;
            }
            System.out.println("");


            int lineNumber = 1;
            while (lineNumber <= nStar) {
                int starColumn = 1;
                while (starColumn <= lineNumber) {

                    System.out.print("*");
                    starColumn++;
                }
                System.out.println("");

                lineNumber++;
            }

            

            while (true) {
                Scanner myScanner = new Scanner(System.in);
                System.out.println("Enter an interger between 1 to 15 : ");
                if (myScanner.hasNextInt()) {
                    int userInput = myScanner.nextInt();

                    if (userInput >= 1 && userInput <= 15) {
                        int lineNumber2 = 1;
                        int nStar2 = userInput;
                        
                        // Print out the single line of # of stars
                        int singleLine = 1; 
                        while (singleLine <= nStar2){
                            System.out.print("*");
                            singleLine++; 
                        }
                       
                       System.out.println(""); 
                        
                        // Print out the triangular sturcture of stars
                        while (lineNumber2 <= nStar2) {
                            int starColumn2 = 1;
                            while (starColumn2 <= lineNumber2) {
                                System.out.print("*");
                                starColumn2++;
                            }

                            System.out.println("");
                            lineNumber2++;
                        }

                        System.out.println("Do you want to continue? Enter Y or y to continue. Everything else for No.");
                        String input = myScanner.next();
                        if (input.equals("Y") || input.equals("y")) {
                            continue;
                        }
                        else {
                            break;
                        }

                    } // End of the if statement that if the user enter an integer between 1 & 15

                    else {
                        System.out.println("You did not enter between an integer between 1 to 15");
                        continue;
                    } // End of the else statement for if it did not enter an integer
                } // End of the if statement for if scanner has an integer

                else {
                    System.out.println("You did not enter an integer");
                    continue;
                }


            }


        } // End of main method

} // End of public class
