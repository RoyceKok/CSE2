// Royce Kok
// 9/05/2014
// CSE2


// Lab 02
// Cyclometer Java Program

// Cyclometer measure two kinds of data: the time elapsed in seconds, and the number of rotations of the front wheel
// The program will contain 
//      a. print the number of minutes for each trip
//      b. print the number of counts for each trip
//      c. print the distance of each trip in miles
//      d. print the distance for the two trips combined


// MPG or miles per gallon is a measure of the distance a vehicle can travel on a gallon of fuel

public class Cyclometer {
    // main method required for every Java program
    public static void main (String[] args) {
        
        // Our input data
        
        int secsTrip1 = 480; // The amount of time elapsed in seconds for Trip 1 (?)
        int secsTrip2 = 3220; // The amount of time elapsed in seconds for Trip 2 (?)
        int countsTrip1 = 1561; // The number of rotation of the front wheel for Trip 1 (?)
        int countsTrip2 = 9037; // The number of rotation of the front wheel for Trip 2 (?)
        
        // Our intermediate variables and output data
        
        double wheelDiameter = 27.0, // The wheel diameter 
        PI = 3.14159, // The value for pie is PI and the numeric value for pie is 3.14159 
        feetPerMile = 5280, // The coversion for feet to mile; there is 5280 feet to 1 mile 
        inchesPerFoot = 12, // The conversion for inches to feet; there is 12 inches in a foot 
        secondsPerMinute = 60; // The conversion for seconds to minute; there is 60 seconds in a minute 
        double distanceTrip1, distanceTrip2, totalDistance; // Declaring the variable for distanceTrip1, distanceTrip2, and totalDistance
        
        // Print out the numbers that you have stored in the variables that store number of seconds and the counts
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
        
        // Run the calculations; store the values
        // The value from the calculation will provide the distance for Trip 1
        
        distanceTrip1 = countsTrip1*wheelDiameter*PI;
        
        // Above gives distance in inches
        // (for each count, a ratation of the wheel travels 
        //the diameter in inches times PI)
        
        distanceTrip1 /= inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI / inchesPerFoot/ feetPerMile;
        
        totalDistance=distanceTrip1+distanceTrip2;
        
        // Print out the output data (distances)
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles" );
        System.out.println("Trip 2 was "+distanceTrip2+" miles" );
        System.out.println("The total distance was "+totalDistance+" miles" );
        
        
    } // end of main method
    
} // end of class
