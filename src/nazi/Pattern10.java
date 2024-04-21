
package nazi;
import java.util.*;


public class Pattern10 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int row=1,space=n-1,star=n;
        while(row<=2*n-1){
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
            //mirroring
            if(row<n){
                star--;
                space--;
            }
            else{
                star++;
                space++;
            }
            row++;
            System.out.println("");
        }
    }
}
