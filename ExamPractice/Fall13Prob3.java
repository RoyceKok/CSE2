public class Fall13Prob3{
   
    /*    public static int B(int y){
           
            y += 3;
            System.out.println("Y is " +y);
            return y;
        }
        
        public static int A(int x){
            System.out.println("X1 " +x);
            x -= 2 * B(x);
            System.out.println("X2 " +x);
            return x; 
        }
        
        public static void main(String args[]){
            int i = 1;
            for (i = 0; i < 4; i++){
                System.out.println("val: " + A(i) );
            }
        }
        
    */
    /* The solution to this problem */
    
    public static int X(int i){
        int j = i - 10;
        return j;
    }
    
    public static int Y(int i){
        int j = X(i);
        return j + 10;
    }
    
    public static void main (String args[]){
        int i =3;
        for(i=3; i>0; i = Y(i)){
            System.out.println(i);
        }
    }
} // End of class