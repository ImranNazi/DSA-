
package basicsProg;
import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int a=0;
        int i=0,b=1;
       System.out.print(a+","+b+",");

        while(i<n){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
            i++;
        }
    }
}
