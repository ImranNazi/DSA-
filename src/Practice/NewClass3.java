
package Practice;

import java.util.Scanner;

public class NewClass3 {
    public static void main(String[] args) {
        
   Scanner kb=new Scanner(System.in);
   int n=kb.nextInt(),pos=1,sum=0;
    while(n>0){
    int rem=n%10;
    sum=(int)(sum+pos*Math.pow(10, rem-1));
    n/=10;
    pos++;
}
        System.out.print(sum+" ");
}
    }
