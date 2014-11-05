// Royce Kok
public class HW09B{

     public static void main(String[]args){
        int m = 4;
        allBlocks(m);    
    }
    
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

} // End of public class