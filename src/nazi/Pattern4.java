
package nazi;

import java.util.Scanner;


public class Pattern4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int row=0;
        int star=0;
        int space=n-1;
        while(row<n){
            int i=0;
            //space
            while(i<space){
                System.out.print("  ");
                i++;   
            }
            //stars
            int j=0;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            
            //updation..
            row++;
            System.out.println("");
            space--;
            star++;
            
        }
    }
}
