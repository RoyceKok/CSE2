// Royce Kok
// CSE 002
// Lab 11: Arrays
/* Write a program that performs the following task 
    (1) Create an array that holds 10 ints
    (2) Ask the user to enter 10 ints and store them in an array
    (3) Search the array for the highest entry and prints it out
    (4) Search the array for the lowest entry and prints it out
    (5) Sum the ints in the array and prints it out
    (6) Copy the contents of the array into a second array in reverse order
    (7) Print the contents of the two arrays in two columns, side by side 
*/
import java.util.Scanner; 
public class Arrays{
    public static void main(String [] arg){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter 10 ints-- ");
        
        // Declare and initializing the array
        int [] tenInts;
        tenInts = new int [10];
        
        // Filling the array in with the user input
        for (int i = 0; i < tenInts.length; i ++){
            tenInts[i] = input.nextInt();
        }
        
        // Search array for the highest entry and print it out
        int max = tenInts[0];
        for (int i =1; i < tenInts.length; i ++){
            if (tenInts[i] > max){
                max = tenInts[i];
            }
        }
        System.out.println ("The highest entry is " +max);
        
        // Search array for the lowest entry and print it out
        int min = tenInts[0];
        for (int i =1; i < tenInts.length; i ++){
            if (tenInts[i] < min){
                min = tenInts[i];
            }
        }
        System.out.println ("The lowest entry is " + min);
        
        // Sum the ints in the array and print out the sum 
        int sum = tenInts[0];
        for (int i =1; i < tenInts.length; i++){
        sum = sum + tenInts[i];
        }
        System.out.println ("The sum of all the entry is " +sum);
        
        // Copy the contests of the array in reverse order
        // Create another array
        System.out.println ("The reverse of the array is");
        int [] tenIntsReverse; 
        tenIntsReverse = new int [10];
        for (int i =0, j = tenInts.length - 1; i < tenInts.length && j >= 0 ; i++, j--){
                tenIntsReverse[j] = tenInts[i]; 
        }
        //for (int i =0; i < tenIntsReverse.length; i++){
        //    System.out.print (tenIntsReverse[i]);
        //}
        
        // Prints the contents of the two arrays in two columns, side by side
        for (int i = 0, j = 0; i < tenInts.length && j < tenIntsReverse.length; i++,j++){
        System.out.println(tenInts[i] + "      " +tenIntsReverse[j]);
        }
    } // End of main method
    
}   // End of public class Arrays