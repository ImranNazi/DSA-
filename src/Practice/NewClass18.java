
package Practice;

import java.util.Scanner;

public class NewClass18 {
    public static void main(String[] args) {
        //prime no
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        isPrime(n);
    }
    public static void  isPrime(int n) {
        int i=2,count=0;
        while(i<n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
    }
}
