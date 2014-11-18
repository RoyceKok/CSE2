// Royce Kok
// CES 002
// HW 10 
// PART A- Check Duplicates 
// This program calls for two method in its main method 
// hasDups() returns true if the array have at least one repeated entry
// exactlyOneDup() returns true if AND only IF there is exactly one duplicate

import java.util.Scanner;
public class FindDuplicates {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            
        String out = "The array ";
        out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
            } while (answer.equals("Y") || answer.equals("y"));
    } // End of main method



    public static String listArray(int num[]) {                 // Method for formating the arrays in this format "{_,_,_,}" 
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    } // End of method for listArray

    public static Boolean hasDups(int num[]){
        boolean Duplicates = false; 
        for (int i = 0; i < num.length; i++){                   // For loop to go through each of the number in the array
            for (int j = i + 1; j < num.length; j++){           // For loop to go through each of the number +1 in the array    
                if (j!=i && num[j] == num[i]){                  // Check to see if the number are EQUAL to each other
                    Duplicates = true;                          // If they are equal, then Dupliciate is TRUE
                }
            }
        }    
        return Duplicates;                                      // Return duplicate as true or false 
    }
    
    public static Boolean exactlyOneDup( int num [] ){
       int duplicatesCount = 0;                                 // Initialize duplicateCount as zero
       boolean oneDuplicates = false;                           // Initialize oneDuplicate as false
       for (int i = 0; i < num.length; i++){                    
            for (int j = i + 1; j < num.length; j++){
                if (j!=i && num[j] == num[i]){
                    duplicatesCount = duplicatesCount + 1;      // If there is a duplicate, add to the sum of duplicate
                }
            }
        }
        
        if( duplicatesCount == 1){                              // If in duplicateCount, there is exactly ONE duplicate
            oneDuplicates = true;                               // Make oneDuplicate = true
        }
        else {                                                  // If thee is 0 duplicate or more than 1 duplicate
            oneDuplicates = false;                              // Make oneDuplicate = false
        }
        return oneDuplicates;                                   // Return true or false
    }
    
    
    
} // End of public class
