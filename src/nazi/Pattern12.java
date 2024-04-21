
package nazi;
import java.util.*;


public class Pattern12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int sp1=n/2,sp2=-1,row=1;
        while(row<=n){
            //space
            int i=0;
            while(i<sp1){
                System.out.print("  ");
                i++;
            }
            //star
            System.out.print("* ");
            //space
            int k=0;
            while(k<sp2){
                System.out.print("  ");
                k++;
            }
            //star
            if(row>=2 && row<n){
            System.out.print("*");
            }
            //mirroring...
            if(row<=n/2){
                sp1--;
                sp2+=2;
                
            }
            else{
                sp1++;
                sp2-=2;
            }
            row++;
            System.out.println("");
        }
    }
}
