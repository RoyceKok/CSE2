// Royce Kok
// Fall 2013 Problem 6

public class Fall2013Prob6{
   /* public static void main (String [] args){
        
        int x = 3;
        int y = 3;
        
        do{
            x+=1;
            do{
                System.out.println("[" +y+ "]");
                y -= 1;
            }while(y>0);
        }while(x<5);
                
    } */
    
    public static void main (String [] args){
        for(int x=3; x == 3; x++){
            for(int y =3; y >= 0; y--){
                System.out.println("[" +y+ "]");
            }
        }
    }
    
}