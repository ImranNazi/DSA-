
package basicsProg;

import java.util.Scanner;


public class NewClass1 {
    public static void main(String[] args) {
        //hcf
        Scanner kb=new Scanner(System.in);
        
        int divident=60,divisor=36;
        while(true){
            int rem=divident%divisor;
            if(rem!=0){
                    divident=divisor;
                    divisor=rem;
            }
            else
                break;
            
        }
        System.out.println(divisor);
        
    }
}
