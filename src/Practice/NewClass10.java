
package Practice;

import java.util.Scanner;


public class NewClass10 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int []a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=kb.nextInt();
            
        }
        sort(a);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
        
    }
    public static void sort(int [] a) {
        for(int turn=1;turn<a.length;turn++){
            for(int i=0;i<a.length-turn;i++){
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
            }
            
        }
    }
}
