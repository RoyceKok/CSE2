// Royce kok
// Spring 2013 Prob 3

public class Spring2013Prob3{
 /*   
    public static int B(int y){
        y+= 5*(2 - 1);
        return y;
    }
    
    public static void A(int x){
        x-= 2*x;
    }
    
    public static void main (String args []){
        int foo = 1;
        for (int i = 0; i <3; i++ ){
            System.out.println("input: " +B(i) );
        }
    }
    
    */
    
    
    public static int X(int k){
        int j = k + 2;
        return j;
    }
    
    public static int Y(int k){
        int j = X(k);
        return j;
    }
    
    public static void main (String args []){
        int i = 1, val = 3; 
        for (i =3; i >0; i --){
            val += Y(val);
        }
        System.out.println("val: " +val);
    }
} // End of class