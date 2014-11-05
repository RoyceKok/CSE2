// Royce Kok
// 10/30/2014

// Lab10
/* This lab session will provide for an opportunity to practice writing methods
that calls methods. The main methods calll for other two methods 
addDigit() and join().
*/

public class MethodCalls{
    
    public static int addDigit(int a, int b){ 
            
        if(a <= 0){
            int makePositive = a * - 1;
            String myAddA = String.valueOf(makePositive);
            String myAddB = String.valueOf(b);
            // Swap A & B
            String temp1 = myAddA;
            myAddA = myAddB;
            myAddB = temp1; 
            // End of swap
            String myAddC = myAddA + myAddB;
            int myAddDMinus = Integer.valueOf(myAddC);
            int myAddD = myAddDMinus * - 1;
            return myAddD;
        }
            
        else{
            String myAddA = String.valueOf(a);
            String myAddB = String.valueOf(b);
            // Swap A & B
            String temp1 = myAddA;
            myAddA = myAddB;
            myAddB = temp1; 
            // End of swap
            String myAddC = myAddA + myAddB;
            int myAddD = Integer.valueOf(myAddC);
            return myAddD;
        } 
    } // End of public int addDigit
    
    public static int join(int a, int b){
        if(a <= 0 || b <= 0){  
            int makePositiveA = a * - 1;
            int makePositiveB = b * - 1;
            String myJoinA = String.valueOf(makePositiveA); 
            String myJoinB = String.valueOf(makePositiveB); 
            String myJoinC = myJoinA + myJoinB;
          
            int myJoinD = Integer.valueOf(myJoinC);
            return myJoinD; 
        }    
        
        else{    
            String myJoinA = String.valueOf(a); 
            String myJoinB = String.valueOf(b); 
            String myJoinC = myJoinA + myJoinB;
          
            int myJoinD = Integer.valueOf(myJoinC);
            return myJoinD; 
        }    
    } // End of public static int join
    
    
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  
