// Royce Kok
// CSE 002
// 11/1/2014

// HW 09
/* This homework will allow students to practice desiging a nested sequence of method 
call that devide a larger problem into subproblems */

import java.util.Scanner;

public class BlockedAgain{
    
    public static void main(String []args){
        int m;
        // for the user to enter int in range 1-9, inclusice. 
        m = getInt();
        allBlocks(m); 
    }
    
    public static int getInt() {
        System.out.print("Enter an int between 1 and 9, inclusive: "); 
        Scanner scan = new Scanner(System.in); 
        //String ScannerInput = scan.next(); 
            int x = checkInt(scan);
            int y = checkRange(x);
         return y;
    } // End of getInt method
    
    public static int checkInt(Scanner myScan){
       while(myScan.hasNext()){
            if(!myScan.hasNextInt()){
                System.out.print("You did not enter an Int; try again: ");
            }
            else {
                int myScanValue = myScan.nextInt(); 
                return myScanValue; 
            }
            myScan.next(); 
        } // End of Whileu
        return 0;     
    } // End of checkInt method
    
    public static int checkRange(int a){
    Scanner myScan = new Scanner(System.in);
        while(a < 0||a > 9){
            System.out.print("You did not enter an int in [1,9]; try again: ");
            a = myScan.nextInt(); 
        }
        return a;
    } // End of checkRange method
    
    
    public static void allBlocks(int x){    // x controls the each one of the block
        for(int m = 1; m <= x; m++){    
            line(x,m);                      // x is the user input, m is the changing tier
        }
        System.out.println("");
    }


    public static void block(int x, int m){    // Prints out the values in one single lines
        System.out.println("");
        int m2= m*2 - 1; 
        for (int l = x-m; l >= 0; l-- ){        // This for loop is for spacing
            System.out.print(" ");              // Print out the spaces
        }
        for(int i = 0; i< m2; i++){             // This is the loop for printing out the values
            System.out.print(m);                // Print out the amount of values according to m2, which is value *2 - 1
        }
        
    }
   
    
    public static void line(int x, int m){      // Prints out the number of lines in a block 
        for(int j = 0; j < m; j++){             // For loop for how many times print out per line  
            block(x,m);                         // Call upon the method block
        }
        System.out.println("");                 // Print out a new line 
        
        for (int l = x-m; l >= 0; l-- ){        // For loop for printing out spaces for dashes at the end of each block
            System.out.print(" "); 
        }
       
        for(int k =0; k <m*2 - 1; k++){         // For loop for prininting out dashes after the spacing occur
            System.out.print("-");
        }
 
    }
    
}    
    
    