// Royce Kok
// CSE 

public class Spring2013Prob6{
    
    
    /*public static void main(String []args){
        int x = 5;
        do{
            x +=2;
            System.out.println(x);
        }while (x < 10);
    } */
    
    ////////////////FOR LOOP /////////////////
    
    /* Transforming it into a for loop 
    public static void main(String [] args){
        int x = 5;
        for (int y = 0; y < 3; y++){
            x = x + 2;
            System.out.println(x);
        }
    } */
    
//////////////////////End OF PART A////////// 

        public static void main (String[] args){
            int i = 0, j =20;
            while (i < 30){
                while (j > 0){
                    System.out.println(i+j);
                    j -= 4;
                }
                i += 4;
                System.out.println("Hello");    // Reads i from 0 to 30 but since there is no print line, there is no output
            }
            System.out.println("Hello 2");
        }
        
        
        /*public static void main (String [] args){
            int i =0, j =20;
                for( int x=0; x<5; x++){
                    System.out.println(i+j);
                    j = j - 4; 
                }
        }*/
        
        
// Output is : 20,16,12,8,4

        
}