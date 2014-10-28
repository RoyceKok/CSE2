// Royce Kok
// 10/25/2014

// HW08
/* This program will call on three different overloaded version of the 
getInput(). Overloaded methods are two or more methods that have the same 
name but takes on different parameterrs. */
// you're orange
import java.util.Scanner; 
public class HW8b{
    
    public static char getInput(Scanner scan, String a){ // your input must match
    	char myChar1 = a.charAt(0); // Checking against the 1st char in the string "Cc" in main method
    	char myChar2 = a.charAt(1); // Checking against the 2nd char in the string "Cc" in main method
    	// myChar1 ==> C, myChar2 ==> c
    	
    	while(scan.hasNextInt()){
    		System.out.print("You did not enter a character from the list 'Cc'; try again - ");
    		String userInput = scan.next();
    	}
    	
    	while(scan.hasNext()){	
    		String scanInput = scan.next();
    		char myScanInputChar = scanInput.charAt(0);
    		if (myScanInputChar == myChar1){ // compareTo()
    			return myChar1;
    		} 
    		if (myScanInputChar == myChar2){
    			return myChar2;
    		}
    		else{
    			System.out.print("You should enter exactly one character - ");
    		}
    	}
    	return '.'; 
    }
    
    public static char getInput(Scanner scan, String myString, int myInt){  // in my main method, automatically assign myInt == 5
    		int round = 0; // 5 chance to get it right
    		
    		while(!scan.hasNext()){
    			while(round <= myInt){ // myInt == 5 from main method
	    			System.out.println("You did not enter a character.");
	    			String userInput2 = scan.next();
	    			round ++; 
	    				if (round == 5){
	    					System.out.println("You failed after 5 tries."); 
	    				} // End of if round == 4 
    			} // End of while(round <5)
    		return ' ';	
    		}// While scanner has next Char
    		
    	
    		while(scan.hasNext()){
	    	 		while(round <= myInt){
			    		String YesNoResponse = scan.next();	// change to Strings
			    		char YesNoResponseChar = YesNoResponse.charAt(0);
			    		if (YesNoResponseChar =='Y'|| YesNoResponseChar == 'y'){
			    			return YesNoResponseChar;
			    		} // End of the if statement
			    		if (YesNoResponseChar =='n'|| YesNoResponseChar == 'N'){
			    			return YesNoResponseChar; 
			    		}
			    		else{
			    			System.out.print("You did not enter a character from the list 'yYnN'; try again - ");
			    			round++;
			    				if (round == 5){
			    					System.out.println("You failed after 5 tries.");
			    					return' ';
			    				}
			    		}
	    			}// End of While round is less than 5
    		} // End of while(scan.hasNext)
    	return ' ';	
    } // End of method getInt(Scanner scan, "yYnN")

	public static char getInput(Scanner scan, String Prompt, String a){ // (Scanner, String, String)
		
		System.out.println(Prompt);
			System.out.print("Enter one of: '0','1','2','3','4','5','6','7','8','9'- ");
			char myChar = 'c'; // initialize myChar with any value first
			
		while(scan.hasNext()){
		    if(!scan.hasNext()){ 
					System.out.println("You did not enter an acceptable character");
					String userInput3 = scan.next();
			} 
		    
			if(scan.hasNext()){ // if user enter an int
			String userInput = scan.next(); 
			char userInputChar = userInput.charAt(0);	
				if (userInputChar == '0' || userInputChar == '1'||userInputChar == '2'||userInputChar == '3'||userInputChar == '4'||userInputChar == '5'||userInputChar == '6'|| userInputChar == '7'|| userInputChar == '8'|| userInputChar == '9'|| userInputChar == '9'){
					myChar = userInputChar; // cast b, an integer, into a character
					return myChar;
				} 
				else{	// if input > 2 char or negative int
					System.out.println("Enter exactly one character");	// "enter a character betweek 0 - 9
					System.out.println(Prompt);
					System.out.print("Enter one of: '0','1','2','3','4','5','6','7','8','9'- ");
				}
			} //if(scan.hasNextInt())
		}	
		return '.'; 	
	 }// public static char getInput

    public static void main(String []arg){
	    char input;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	    input= getInput(scan,"Cc"); // getInput(Scanner, String) 
	    System.out.println("You entered '"+input+"'");
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	    input= getInput(scan,"yYnN", 5); //getInput(Scanner, String, int)
	    if(input!=' '){
   	    System.out.println("You entered '"+input+"'");
	    }
	    input=getInput(scan,"Choose a digit.","0123456789"); // (Scanner, String, int) <== are these your inputs?
	    System.out.println("You entered '"+input+"'");
	}  // End of main method
  
} // End of class

