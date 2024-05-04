
package basicsProg;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int n=kb.nextInt();
       int []a=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=kb.nextInt();
       }
       Display(a);
       
    }
    public static void Display(int []a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
 
}
