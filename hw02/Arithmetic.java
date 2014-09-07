// Royce Kok
// 9/06/2014
// CSE2
// hw02

// This is a senario where an individual is at Walmart's and want to compute 
// the cost of item and also the 6% PA sales tax

public class Arithmetic {

    //Main method 
   public static void main (String[]args ){
       
    // Number of pairs of socks
    int nSocks = 3; 
    // Cost per pair of socks
    // ('$' is part of the vaiable name)
    double sockCost$ = 2.58;
    
    // Number of drinking glasses
    int nGlasses = 6; 
    // Cost per glass
    double glassCost$ = 2.29;
    
    // Number of boxes of envelopes
    int nEnvelopes = 1;
    // Cost per box of envelopes
    double envelopesCost$ = 3.25;
    
    // The PA Sales Tax
    double taxPercent = 0.06;
    
    // Calculations: 1. Cost of each of the three kinds of items
    //               2. The total cost
    //               3. The total sales tax
    //               4. The total cost of the transaction
    
    // Declare the variables for each individual item
    double totalSockCost$; // total cost of socks
    double totalDrinkingGlassesCost$; // total cost of drinking glasses
    double totalEnvelopesCost$; // total cost of envelopes
        // Calculate the cost of each items given the unit(s) purchase
        totalSockCost$ = nSocks * sockCost$;
        totalDrinkingGlassesCost$ = nGlasses * glassCost$;
        totalEnvelopesCost$ = nEnvelopes * envelopesCost$;
            // Print out the total cost of each item
            System.out.println("Total cost for Socks is " + totalSockCost$+ ".");
            System.out.println("Total cost for Drinking Glasses is "+ totalDrinkingGlassesCost$+ ".");
            System.out.println("Total cost for Envelopes is "+ totalEnvelopesCost$+ ".");
    
    // Declare the variable for the total cost of all items (excluding sales tax)
    double totalCostPreTax$;
        //Calculate the pre tax total cost for all item
        totalCostPreTax$ = totalSockCost$ +totalDrinkingGlassesCost$ + totalEnvelopesCost$;
            // Print out the total cost of all item (pre tax)
            System.out.println("Total cost for all item excluding sales tax is "+ totalCostPreTax$+ ".");
            
    // Decalre the variable for the amount of sales tax
    double salesTax$;
        // Calculate the amount of tax
        salesTax$ = totalCostPreTax$ * taxPercent;
            // Round off the sales tax to two decimal point
            salesTax$ = (int)(salesTax$*100)/100.00; 
                // Print out the amount for sales tax
                System.out.println("The amount of sales tax is "+salesTax$+ ".");
    
    //Declare the variable for the total cost of the transaction
    double totalCostOfTransaction$ ;
        // Calculate the total cost of the transaction
        totalCostOfTransaction$ = totalCostPreTax$ + salesTax$ ;
            // Print out the total cost of the transaction
            System.out.println("The total cost of the transaction is "+totalCostOfTransaction$+ ".");
            
        
   }
   
   
   
   
    
}



