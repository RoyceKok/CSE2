// Royce Kok
// Practice for Triangular

public class Triangular{
    public static void main (String [] args){
        for (int x = 0; x <= 4; x++){
            for(int y = 0; y <= x; y++){
                System.out.print("b");
            }
            System.out.println("");
        }
    System.out.println("");
    otherTriangular(4);
    otherTriangular2(4);
    } // End of public main method
    
    public static void otherTriangular(int Tri){
        for (int x =0; x <= Tri; x++){
            for(int y = 0; y <= 4-x; y++){
                System.out.print("b");
            }
            System.out.println("");
        }
        
    }
    
    public static void otherTriangular2(int Tri){
        for (int x =0; x <=4; x++){
            for( int y = 4; y > x+ 1; y--){
                System.out.print("a");
            }
            System.out.print("b");
            System.out.println("");
        }
    }
} // End of public class