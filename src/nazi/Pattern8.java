
package nazi;

import java.util.*;


public class Pattern8 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int star=1,space=2*n-3,row=1;
        while(row<=n){
            //star
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
                
            }
            //space
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=0;
            if(row==n){
                k=1;
            }
               while(k<star){
                System.out.print("* ");
                k++;
                
            }
               //upd
               star++;
               space-=2;
               row++;
               System.out.println("");
               
        }
    }
}
