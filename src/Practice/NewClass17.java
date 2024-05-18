
package Practice;

import java.util.Scanner;


public class NewClass17 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int sum=0,i=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*Math.pow(2,i );
            i++;
            n/=10;
            
        }
        System.out.println(sum+" ");
    }
}
