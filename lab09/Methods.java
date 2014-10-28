// Royce Kok
// CSE 002
// 10/24/2014
// Lab 09

import java.util.Scanner;
public class Methods {

    public static int getInt(Scanner scan) {                                    // Method #1, force the user to enter an int and return an int
            System.out.println("Enter an int");
              
            while(!scan.hasNextInt()){
            System.out.println("You did enter an integer. Try again.");
            String userInput = scan.next(); 
            }
            
            int a = scan.nextInt();
            return a;  
        } // End of getInt method


    public static int larger(int a, int b) {                                      // Method #2, find out the larger value between a and b
            if (a > b) {                                                        // This if statement states that if a is greater than b, 
                return a; 
            }   // end of the (b > c) if statement
            else {                                                        // This if statement states that if b is greater than a
                return b;                                                
            }   // end of the (c > b) if statement
        }   // End of the largerBC method

    
    public static boolean ascending(int a, int b, int c){
            if (a<b && b<c) {
                return true; 
            }
            else{
                return false; 
            }
    }   // End of public int ascending(a,b,c)
    

    public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            int a, b, c;
            System.out.println("Enter three ints");
            a = getInt(scan);
            b = getInt(scan);
            c = getInt(scan);
            System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
            System.out.println("The larger of " + a + ", " + b + ", and " + c +
                " is " + larger(a, larger(b, c)));
            System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
                ", and " + c + " are in ascending order");
        } // End of  main method


} // End of the class
