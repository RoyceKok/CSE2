// Royce Kok
// CSE 002
// HW 10
// Poker Odds
// Using the main method, provide two other method
/* showOneHand() should generate random poker hands prompting the user if they 
   would like another hand to be generated
   
   simulateOdds() should randomly generate 10,000 hands and count the number of 
   times that a hand with a pair of a specific rank occurs, along with the number
   of hands that do not have a pair
*/

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String[] args){                     // Main method
        showHands();                                            // Calls on showHands()
        simulateOdds();                                       // Calls on simulateOdds()
    } // End of main method
    
    public static void showHands(){
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            int [] CardsID = new int [52];                          // Create a New Array of 52 for the number of cards
            for (int i = 0; i < CardsID.length; i++){               // Fill the array in with values 
                CardsID[i] = i;                                     
            }
            
            int []myDrawFive = {-1,-1,-1,-1,-1};                    // Create a new array and fill it at the same time
            for (int i = 0; i < 5; i++){                            // Need to randomly draw five times and replace the value with -1
                int draw = (int)(Math.random()*CardsID.length);     // Draw a random number from the pile of cards
                myDrawFive[i] = CardsID[draw];                               // Replace the array in the DrawFive with the random number draw
                for (int k = draw; k < CardsID.length-1; k ++){     // Shifts the cards to the left one 
                    CardsID[k] = CardsID[k+1];                      // Replae the last one with -1
                }    
                CardsID[51] = -1; 
            }
            
            String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};        // Array of Strings for Suits 
            String [] ranks = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};       // Array for String of ranks
            
            String myClubs = "Clubs: "; 
            String myDiamonds = "Diamonds: "; 
            String myHearts = "Hearts: ";
            String mySpades = "Spades: ";
            

            for (int i = 0; i < 5; i++){                     // Display the first 5 cards 
              String rank = ranks [CardsID[i] % 13];         // String for ranks
                if(myDrawFive[i] / 13 == 0){
                    myClubs = myClubs +" "+ rank;
                }
                if(myDrawFive[i] / 13 == 1){
                    myDiamonds = myDiamonds +" "+ rank;
                } 
                if(myDrawFive[i] / 13 == 2){
                    myHearts = myHearts +" "+ rank; 
                }
                if(myDrawFive[i] / 13 == 3){
                    mySpades = mySpades +" "+ rank;
                }
            }    
             System.out.println(myClubs);
             System.out.println(myDiamonds);
             System.out.println(myHearts);
             System.out.println(mySpades);
             
            System.out.println("Go again? Enter 'y' or 'Y', anything else to quit");
            answer = scan.nextLine();
        } while (answer.equals("Y") || answer.equals("y"));
   }// End of public static void showHands
   
   public static void simulateOdds(){
        int [] freq = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        for (int j = 0; j< 10000; j++){                                 // Run this loop 10000 times
            int [] CardsID = new int [52];                              // Create a New Array of 52 for the number of cards
            for (int i = 0; i < CardsID.length; i++){                   // Fill the array in with values 
                CardsID[i] = i;                          
            }
            int []myDrawFive = {-1,-1,-1,-1,-1};                    // Create a new array and fill it at the same time
            for (int i = 0; i < 5; i++){                                // Need to randomly draw 5 times and replace the value with -1
                int draw = (int)(Math.random()*(CardsID.length-i));         // Draw a random number from the pile of cards
                //System.out.println(CardsID[draw]);
                myDrawFive[i] = CardsID[draw];                          // Replace the array in the DrawFive with the random number draw
                for (int k = draw; k < CardsID.length-1; k ++){         // Shifts the cards to the left one 
                    CardsID[k] = CardsID[k+1];                          // Replae the last one with -1
                }    
                CardsID[51] = -1; 
            } 
            int duplicateCount = 0; 
            for (int y = 0; y < myDrawFive.length; y++){                // Count of duplicates
                for (int z = y+ 1; z <myDrawFive.length; z++){
                        if (myDrawFive[y] % 13 == myDrawFive[z] % 13){
                            
                            if (myDrawFive[y] % 13 == 0 && exactlyOneDup(myDrawFive) == true){
                                 freq[0] = freq[0]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 1 && exactlyOneDup(myDrawFive) == true){
                                 freq[1] = freq[1]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 2 && exactlyOneDup(myDrawFive) == true){
                                 freq[2] = freq[2]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 3 && exactlyOneDup(myDrawFive) == true){
                                 freq[3] = freq[3]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 4 && exactlyOneDup(myDrawFive) == true){
                                 freq[4] = freq[4]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 5 && exactlyOneDup(myDrawFive) == true){
                                 freq[5] = freq[5]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 6 && exactlyOneDup(myDrawFive) == true){
                                 freq[6] = freq[6]+ 1;  
                            }
                            if (myDrawFive[y] % 13 == 7 && exactlyOneDup(myDrawFive) == true){
                                 freq[7] = freq[7]+ 1;  
                            }
                            if (myDrawFive[y] % 13 == 8 && exactlyOneDup(myDrawFive) == true){
                                 freq[8] = freq[8]+ 1;  
                            }
                            if (myDrawFive[y] % 13 == 9 && exactlyOneDup(myDrawFive) == true){
                                 freq[9] = freq[9]+ 1;  
                            }
                            if (myDrawFive[y] % 13 == 10 && exactlyOneDup(myDrawFive) == true){
                                 freq[10] = freq[10]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 11 && exactlyOneDup(myDrawFive) == true){
                                 freq[11] = freq[11]+ 1;  
                            } 
                            if (myDrawFive[y] % 13 == 12 && exactlyOneDup(myDrawFive) == true){
                                 freq[12] = freq[12]+ 1;  
                            } 
                        }    
                    }
                }
        } // End of the for loop for the 10000 iteration 
        
        String [] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};       // Array for String of ranks
        
        System.out.println ("rank    freq of exactly one pair"); 
        for (int i = 0; i < ranks.length; i++){    
                System.out.println(ranks[i]+"          " +freq[i]); 
        } 
        int sum  = 0;
        for (int i = 0; i < freq.length; i++){
            sum = sum + freq[i];
        }
        
        int total = 10000;
        int notExactlyOnePair = total - sum; 
        //System.out.println("The sum of all freq is " +sum);
        System.out.println("---------------------------");
        System.out.println("total not exactly one pair: " +notExactlyOnePair);
   } // End of public static void simulateOdds()
   
   public static Boolean exactlyOneDup( int num [] ){
       int duplicatesCount = 0;                                 // Initialize duplicateCount as zero
       boolean oneDuplicates = false;                           // Initialize oneDuplicate as false
       for (int i = 0; i < num.length; i++){                    
            for (int j = i + 1; j < num.length; j++){
                if (num[j]% 13 == num[i]% 13){
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