
package basicsProg;

import java.util.Scanner;


public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int sum=0,mul=1;
        while(n>0){
            int rem=n%2;
            sum+=rem*mul;
            mul*=10;
            n/=2;
            
        }
        System.out.println(sum+"");
    }
}
