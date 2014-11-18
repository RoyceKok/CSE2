// Royce Kok
// Spring 2013 Problem 5
public class Spring2013Prob5{
    public static double X(double i, double j){
        return i *  (j * 2);
    }
    
    public static int X(int i, int j){
        return i * j;
    }
    
    public static void main(String args []){
        int i = 3;
        int j = 5;
        double k = 4.0;
        double l = 5.0; 
        System.out.println("v1: " X((double)i, (double)j));
        System.out.prinltn("v2: " X((int)k, l)); 
    }
}