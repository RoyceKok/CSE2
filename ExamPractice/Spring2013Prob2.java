// Royce Kok
// Spring 2013- Problem 2

/*public class Spring2013Prob2{
    public static void main (String [] args){
        int a = 0;
        while (a<1){
            System.out.println("[START]");
            int j =5;
            for(int i = 6; i >0; i--){
                int k = 6*i-j;
                System.out.println(k);
                j--;
            }// End of for loop
            a++;
        System.out.println("[End]");    
        } // End of while statement
    } // End of main method
} // End of public class */

//////////////Problem B/////////////////////////////////////
public class Spring2013Prob2{
    public static void main (String [] args){
        for( int a = 2; a <= 4; a++){       // for loop for the number of blocks
            for (int i = 1; i <= a; i++){   // for loop for the number of rows
                for (int j =4; j >4-i; j--){    // for loop for the number fo columns
                    System.out.print("b"); 
                } // End of int j
                System.out.println("");
            }// End of for int i
        } // End of for int a loop
    }
    
} // End of public class