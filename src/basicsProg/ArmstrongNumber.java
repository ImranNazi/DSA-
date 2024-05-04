
package basicsProg;
import java.util.Scanner;

public class ArmstrongNumber {
    int h=9;

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        
        boolean x=Armstrong(countOfDigit(n),n);
        if(x==true)
            System.out.println("is armstrong no.");
        else
            System.out.println("is not a armstrong no.");

    }
    
    public static int countOfDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static boolean Armstrong(int count,int n){
        int sum=0;
        int realNo=n;
        while(n>0){
        int rem=n%10;
        sum+=Math.pow(rem, count);
        n/=10;
        }
        if(sum==realNo){
            return true;
        }
        else
           return false;

    }
}


