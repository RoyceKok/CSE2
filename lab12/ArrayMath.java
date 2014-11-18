// Royce Kok
// CSE 002
// Lab 12: Array Arithmetic
// The program below will have to call upon TWo method = equals() and addArrays()

public class ArrayMath {
  
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v = addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
   // System.out.println("It is " + equals(x,y)+" that "+display(x)+
      //                 " == "+display(y));
    //System.out.println("It is " + equals(z,w)+" that "+display(z)+
        //               " == "+display(w));
    //System.out.println("It is " + equals(u,z)+" that "+display(u)+
         //              " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  /*public static Boolean equals(double[] xArray, double[] yArray){       // Two array with the same length and the same values in the same location 
     for (int i =0; i < xArray; i++ )
        if  ( xArray.length == yArray.length){
            return true;
        else {
            return false; 
        }
     }
  } */
  
  
  public static double [] addArrays(double[] xArray, double[] yArray){    
      double [] sum = new double [6];
      for (int i = 0; i < xArray.length; i++){
        sum[i] =  xArray[i] + yArray[i];
      }
      return sum; 
  }
  
  
}




