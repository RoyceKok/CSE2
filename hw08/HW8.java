// Royce Kok
// 10/25/2014

// HW08
/* This program will call on three different overloaded version of the 
getInput(). Overloaded methods are two or more methods that have the same 
name but takes on different parameterrs. */
// you're orange
import java.util.Scanner; 
public class HW8{
    
    public static char getInput(Scanner scan, String a){ // your input must match the input in main method
    	char myChar1 = a.charAt(0); // Checking against the 1st char in the string "Cc" in main method
    	char myChar2 = a.charAt(1); // Checking against the 2nd char in the string "Cc" in main method
    	// myChar1 ==> C, myChar2 ==> c
    	
    	while(scan.hasNextInt()){    // This is to take into account that the user input an integer
    		System.out.print("You did not enter a character from the list 'Cc'; try again - ");
    		String userInput = scan.next();
    	}
    	
    	while(scan.hasNext()){	    // If the user input a string, run this while loop
    		String scanInput = scan.next();     
    		char myScanInputChar = scanInput.charAt(0);     // Convert the string into a chat
    		if (myScanInputChar == myChar1){                // If the scanner/user input == to the "C" in main method
    			return myChar1;								// return the value
    		} 
    		if (myScanInputChar == myChar2){				// If the scanner/user input == to the "c" in main method
    			return myChar2;								// retrun the value
    		}
    		else{											// If it doesn't match, print this out
    			System.out.print("You should enter exactly one character - ");
    		}
    	}
    	return '.';  // Created a placeholder return value, will not actually reach this return
    }
    
    public static char getInput(Scanner scan, String myString, int myInt){  // in my main method, automatically assign myInt == 5
    		int round = 0; 									// 5 chance to get it right
    		
    		while(!scan.hasNext()){							// If the scanner doesn't have a string, output the following
    			while(round <= myInt){ 						// myInt == 5 from main method
	    			System.out.println("You did not enter a character.");
	    			String userInput2 = scan.next();		// Take in another value from user
	    			round ++; 								// increment the round
	    				if (round == 5){					// If the user has use up all 5 rounds, print the following
	    					System.out.println("You failed after 5 tries."); 
	    				} // End of if round == 5 
    			} // End of while(round <5)
    		return ' ';	
    		}// While scanner has next Char
    		
    	
    		while(scan.hasNext()){							// If the scanner does have a string
	    	 		while(round <= myInt){					// If the round is less than 5, keep going
			    		String YesNoResponse = scan.next();	// change to Strings
			    		char YesNoResponseChar = YesNoResponse.charAt(0);  // Convert the string into a character
			    		if (YesNoResponseChar =='Y'|| YesNoResponseChar == 'y'){ // Check if the user input is "Y" or "y"
			    			return YesNoResponseChar;							 // If so, return the corresponding value
			    		} // End of the if statement
			    		if (YesNoResponseChar =='n'|| YesNoResponseChar == 'N'){ // Check if the user input is "N" or "n"
			    			return YesNoResponseChar; 							 // If so, return the corresponding value
			    		}
			    		else{													 // If the user input is none of the values above, try again
			    			System.out.print("You did not enter a character from the list 'yYnN'; try again - ");
			    			round++;
			    				if (round == 5){								 // If the user tried 5 times, end the trial run
			    					System.out.println("You failed after 5 tries."); // Return nothing
			    					return' ';
			    				} // End of if round ==5
			    		} // End of else statement
	    			}// End of While round is less than 5
    		} // End of while(scan.hasNext)
    	return ' ';	// Place holder return statement, return nothing
    } // End of method getInt(Scanner scan, "yYnN")

	public static char getInput(Scanner scan, String Prompt, String a){ // (Scanner, String, String)
		System.out.println(Prompt);							// Print out the prompt from the main method
		System.out.print("Enter one of: '0','1','2','3','4','5','6','7','8','9'- ");
		char myChar = 'c'; 									// initialize myChar with any value first
		
		if(!scan.hasNext()){ 								// If statement for if scanner do not have the next string
					System.out.println("You did not enter an acceptable character");
					String userInput3 = scan.next();
			} 	
			
		while(scan.hasNext()){									// While loop for if the scanne has Next string
																// Keep looping until the user enter the next string
			String userInput = scan.next(); 					// Name the string
			char userInputChar = userInput.charAt(0);			// Take the first value of the string and make it into a character
				// If the userInput match the value we assigned, run the following and return the corresponding values
				if (userInputChar == '0' || userInputChar == '1'||userInputChar == '2'||userInputChar == '3'||userInputChar == '4'||userInputChar == '5'||userInputChar == '6'|| userInputChar == '7'|| userInputChar == '8'|| userInputChar == '9'|| userInputChar == '9'){
					myChar = userInputChar; // cast b, an integer, into a character
					return myChar;
				} 
				// Else, run the following and print out the following statements
				else{	// if input > 2 char or negative int
					System.out.println("You did not enter an acceptable character");	// "enter a character betweek 0 - 9
					System.out.println(Prompt);
					System.out.print("Enter one of: '0','1','2','3','4','5','6','7','8','9'- ");
				}
			
		}	
		return '.'; 	// Placeholder for return statements
	 }// public static char getInput

    public static void main(String []arg){							// Main method
	    char input;													// Assign all the inputs into characters
	    Scanner scan = new Scanner(System.in);						// Turn on the scanner
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // Print out statement to prompt user to enter the values
	    input= getInput(scan,"Cc"); 	 // getInput(Scanner, String) 
	    System.out.println("You entered '"+input+"'");				// Print out statement
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");			// Choices for the print out statements
	    input= getInput(scan,"yYnN", 5); //getInput(Scanner, String, int)	
	    if(input!=' '){												// If the input have "something"
   	    System.out.println("You entered '"+input+"'");				// Print out the "something" value
	    }
	    input=getInput(scan,"Choose a digit.","0123456789"); // (Scanner, String, int) <== are these your inputs?
	    System.out.println("You entered '"+input+"'");		 		// Print out the digit that the user enter
	}  // End of main method
  
} // End of class

