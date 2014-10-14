// Royce Kok
// CSE 002
// 10/11/2014

// HW 06
// Roulette Stimulation
/* This program will test the gambler assumption about his "system" where he
bets on the same random number for 100 times in a row. The gambler believes
that this "system" would lead him to win money. Run the stimulation 1000 times
in a row. */ 


public class Roulette{
    public static void main (String [] args){
        
        int betNumberin1000 = 0;
        int timesWinIn1000 =0;
        int timesLostEverything = 0;
        int sumOfMoneyWon =0;
        
        
        while(betNumberin1000 <1000){
            
                // THIS CODE FROM HERE ON TEST ALL THE VALUES IN ONE SET OF 100 GAMES
                // The random number that the gambler selectes (remains constant for 100 times)
                int randomNumberUser = (int)(Math.random()*39);     
        
                    int betNumber = 0;          // The number of bets in one set of games [range 0-99]
                    int initialMoney = 0;       // Money that the gambler won [starts with $0]
                    int timesWin = 0;
                    
                
                        while(betNumber <100){
                            
                            int randomRoulette = (int)(Math.random()*39);    // Generate the game of Roulette 
                            
                            if (randomNumberUser == randomRoulette){         // Check winning # = random #
                                initialMoney = initialMoney + 36;            // If so add $36
                                timesWin = timesWin + 1;                     // Compute the times you won
                            }
                               
                            betNumber++;                                     // Increment the betNumber
                        } //End of the while loop 
                            
                    
                    // At the end of the 100 trial, compute the total
                    if (timesWin > 3){
                        timesWinIn1000 = timesWinIn1000 + 1;                 // Compute the number of times in out of 1000 that you won
                    }
                    if (timesWin ==0){
                        timesLostEverything = timesLostEverything + 1;       // Compute the times that you did not win at all in a set of 100 game
                    }
            
            sumOfMoneyWon = sumOfMoneyWon + initialMoney;                    // Compute the sum of money won
            betNumberin1000++;                                               // Increment the betNumberin1000
        } // End of the loop for 1000 times    
        
        
        // Print out the results of 1000 repetion of set of 100 spins
        System.out.println("The total amount of money that you have won is $" +sumOfMoneyWon+ "." );
        System.out.println("The amount of times that you have lost everything is " +timesLostEverything+ ".");
        System.out.println("The amount of times that you have won in a session of 1000 games are " +timesWinIn1000+ ".");
        
        
    } // End of main method
    
} // End of public class