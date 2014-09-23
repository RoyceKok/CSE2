// Royce Kok
// CSE 002
// 09/19/2014

// Hw04- Income Tax
/* The program will prompt the user to enter an int that gives the thousands of 
dollars of income and then writes out the amount of tax on the on the income. */

// <20          = 5%
// >=20 & <40   = 7%
// >=40 & <78   = 12%
// >= 78        = 14%

import java.util.Scanner;

public class IncomeTax{
    public static void main (String[] args){
        
        // Declare the scanner object
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter an int giving the number of thousands- ");
        
        double IncomeTaxAmount;
     
        double class1 = 0.05;
        double class2 = 0.07;
        double class3 = 0.12;
        double class4 = 0.14;
    
    // List each scenario of income group and print out their selecte statements
        if(myScanner.hasNextInt()){
            int incomeInput = myScanner.nextInt();
            int incomeInputInThous = incomeInput *1000;
            
            
            if (incomeInput < 0){
                System.out.println("You did not enter a positve integer.");
            }
            else if (incomeInput < 20 && incomeInput >0){
                IncomeTaxAmount = (incomeInputInThous *class1);
                double IncomeTaxAmount2 = (int) IncomeTaxAmount*10/10.0;
                System.out.println("The tax rate tial 2 on $" +incomeInputInThous+ " is " +class1+ ", and the tax is " +IncomeTaxAmount2+ ".");
            }
            else if (incomeInput >= 20 && incomeInput <40){
                IncomeTaxAmount = (incomeInputInThous * class2);
                double IncomeTaxAmount2 = (int) IncomeTaxAmount *10/10.0;
                System.out.println("The tax rate on $" +incomeInputInThous+ " is " +class2+ ", and the tax is " +IncomeTaxAmount2+ "." );
            }
            else if (incomeInput >= 40 && incomeInput <78){
                IncomeTaxAmount = (incomeInputInThous *class3);
                double IncomeTaxAmount2 = (int) IncomeTaxAmount * 10/10.0;
                System.out.println("The tax rate on $" +incomeInputInThous+ " is " +class3+ ", and the tax is " +IncomeTaxAmount2+ ".");
            }
            else if (incomeInput >= 78){
                IncomeTaxAmount = (incomeInputInThous * class4);
                double IncomeTaxAmount2 = (int) IncomeTaxAmount * 10/10.0; 
                System.out.println("The tax rate on $" +incomeInputInThous+ " is " +class4+ ", and the tax is " +IncomeTaxAmount2+ "." );
            }
        
        }
        
        else {  
            System.out.println("You did not input an integer.");
        }
        
    } // end of main method
    
    
} // end of public class 