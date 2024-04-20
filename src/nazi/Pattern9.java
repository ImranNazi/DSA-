
package nazi;
import java.util.*;


public class Pattern9 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int star=1,row=1;
        while(row<=2*n-1){
            //star
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
                
            }
            //mirror
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            row++;
            System.out.println("");
        }

    }
}
