import java.util.Scanner;

public class HW09trial{
    
    public static void main(String[]args){
        System.out.println("Enter an int between 1 and 9, inclusive- "); 
        Scanner scan = new Scanner(System.in); 
        //String ScannerInput = scan.next(); 
            int x = checkInt(scan);
            int y = checkRange(x);
            if ( y == y){
            System.out.println(y);
            }
                
    } // End of getInt method
    
    public static int checkInt(Scanner myScan){
       while(myScan.hasNext()){
            if(!myScan.hasNextInt()){
                System.out.println("You did not enter an Int; try again: ");
            }
            else {
                int myScanValue = myScan.nextInt(); 
                return myScanValue; 
            }
            myScan.next(); 
        } // End of Whileu
        return 0;     
    } // End of checkInt method
    
    public static int checkRange(int a){
    Scanner myScan = new Scanner(System.in);
        while(a < 0||a > 9){
            System.out.println("You did not enter an int in [1,9]; try again: ");
            a = myScan.nextInt(); 
        }
        return a;
    } // End of checkRange method
}    