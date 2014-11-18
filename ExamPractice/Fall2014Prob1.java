// Royce Kok
// Fall 2014 Problem 1

public class Fall2014Prob1{
    public static void main (String [] args){
        for (int j =0; j<5; j++){
            for (int k= 0; k<=j; k++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
        for(int j =5; j <10; j++){
            for (int k =10; k >= j + 1  ; k--){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }   // End of main method
    
}   // End of public class