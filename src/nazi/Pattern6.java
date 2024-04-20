
package nazi;

import java.util.*;


public class Pattern6 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int space=0,star=n,row=0;
        while(row<n){
            //space
            int i=0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            //upd...
            System.out.println("");
            row++;
            space+=2;
            star--;
            
        }
    }
}
