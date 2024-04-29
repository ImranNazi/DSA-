
package basicsProg;
import java.util.Scanner;


public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int sum=0,mul=1;
        while(n>0){
            int rem=n%10;
            sum+=rem*mul;
            mul*=2;
            n/=10;
            
        }
        System.out.println(sum+"");
    }
}
