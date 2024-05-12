
package Practice;

import java.util.Scanner;


public class NewClass9 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int [] x=new int [n];
        for(int j=0;j<x.length;j++){
            x[j]=kb.nextInt();
        }
        rev(x);//array is reversed
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        
    }
    public static void rev(int [] x) {
        int i=0,j=x.length-1,temp;
        while(i<j){
            temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;
            
        }
        
    }
}
