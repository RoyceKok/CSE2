// Royce Kok
// Fall 2013- Problem 2 

// Output should look like this
// 6666
// 666
// 66
// 6
// 555
// 55
// 5
// 44 
// 4
// 3
// 2
// 1

public class Fall13Prob2{
    public static void main (String [] args){
      
      for (int i = 6; i > 0; i--){
          for (int j = 0; j <(i-2); j++){
              for (int k =0; k < (i-j- 2); k++){
              System.out.print(i);
              }
              System.out.println("");
          }
      }
      
      for (int l = 2; l>  0; l--){
          System.out.println(l);
      }
    }
} // End of public class
