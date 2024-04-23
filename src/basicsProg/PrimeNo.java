
package basicsProg;

import java.util.Scanner;


public class PrimeNo {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0,i=2;
        while(i<n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count>=1){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
    }
}
