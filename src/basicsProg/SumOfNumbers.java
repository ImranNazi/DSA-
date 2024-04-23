
package basicsProg;

import java.util.Scanner;


public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;//last digit we get 
            sum+=rem;
            n/=10;
        }
        System.out.println(sum+" ");
    }
}
