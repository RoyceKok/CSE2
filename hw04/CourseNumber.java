// Royce Kok
// CSE 002
// 09/19/2014

// Hw04- Course Number
/* The program will prompt the user to input a 6 digit number for the course. 
The first four digits is the year in which the course is offered and the las
two digit is the number for in which semester the course is offer */

// 10 = spring
// 20 = summer 1
// 30 = summer 2
// 40 = fall


import java.util.Scanner;

public class CourseNumber{
    public static void main (String[] args){
    
    // Declare my scanner object
    Scanner courseScan;
    courseScan = new Scanner(System.in);
    System.out.print("Enter a six digit number giving the course semester- ");
    
        if(courseScan.hasNextInt()){
            int courseInput = courseScan.nextInt();
                
                if (courseInput >= 186510 && courseInput <= 201440 ){
                    int semester = courseInput%100;
                    int year = (courseInput / 100);
                    
                    if (semester == 10 ){
                        System.out.println("The course was offered in the spring of year " +year+ ".");
                    }
                    else if (semester == 20 ){
                        System.out.println("The course was offered in the summer 1 of year " +year+ ".");
                    }
                    else if (semester == 30 ){
                        System.out.println("The course was offered in the summer 2 of year " +year+ ".");
                    }    
                    else if (semester == 40){
                        System.out.println("The course was offered in the fall of year " +year+ ".");
                    }
                    else {
                        System.out.println("This is not a legitimate semester");
                    }
                } // end of if statement for course intput within range
                
                else {
                    System.out.println("The number was outside of the range [186510, 201440]");
                } // end of else statement = courseInput is outside of range
            
        } // end of if (courseScan) statement
        
        else {
            System.out.println("You did not input an integer");
        } // end of else staement for you did not input integer
        
    }
    
    
    
}// end of public class