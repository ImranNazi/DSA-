
package nazi;
import java.util.*;


public class Pattern11 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int star=n/2+1,space=-1,row=1;
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
            if(row==1 || row==n){
                k=1;
            }
            while(k<star){
                System.out.print("* ");
                k++;
            }
            //mirroring..
            if(row<=n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            row++;
            System.out.println("");
            
        }
        
    }
}
