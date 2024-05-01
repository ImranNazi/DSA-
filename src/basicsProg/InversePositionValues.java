
package basicsProg;

import java.util.Scanner;


public class InversePositionValues {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int sum=0,n=kb.nextInt(),pos=1;
        while(n>0){
            int rem=n%10;
            sum=(int)(sum+pos*Math.pow(10, rem-1));
            pos++;
            n/=10;
            
        }
            System.out.print(sum+" ");    
    }
}
