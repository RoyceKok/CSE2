// Royce Kok
// Spring 2013 Prob 1

public class Spring2013Prob1{
   /* public static void main(String []args){
        int j =1; 
        int i =3; 
        for (i=6; i >-6; i =i-2){
            j= j*2;
        }
        System.out.println(j);
    } // End of main method
    
    */
    
    public static void main (String [] args){
        int i = 0;
        int j = 1;
        for (i =1; i <4; i++){
            for (j=1; j<3; j++){
                for (int k =0; k<j; k++){
                    System.out.println("(" +i+ "," +j+ ")");
                }
            }
        System.out.println("1 " +i);
        i++;
        System.out.println("1 " +i);
        }
      
    }
    
} // End of public class