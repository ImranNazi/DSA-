
package basicsProg;
import java.util.Scanner;


public class HCF {
    public static void main(String[] args) {
    
      int divisor=36,divident=60;
      while(divident%divisor!=0){
          int rem=divident%divisor;
          divident=divisor;
          divisor=rem;
      }
        System.out.println(divisor+" ");
        
    }
}

/*
    This while loop calculates the HCF using the Euclidean algorithm.
The loop continues until the remainder of dividend divided by divisor becomes 0, indicating that the current divisor is the HCF. 
In each iteration, the remainder (rem) is calculated using the modulo operator (%).
Then, dividend is updated to the current divisor, and divisor is updated to the current rem. This process continues until the remainder becomes 0.
*/