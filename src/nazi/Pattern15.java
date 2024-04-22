
package nazi;
import java.util.*;


public class Pattern15 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int space=n-1,num=1,row=1,val=1;
        while(row<=2*n-1){
            //space
            int i=0;
            while(i<space){
                System.out.print("  ");
                i++;
            }
            //num
            int p=val,j=0;
            
            while(j<num){
                System.out.print(p+" ");
                if(j<n/2){
                    p++;
                }
                else{
                    p--;
                }
                j++;
            }
            //mirroring
            if(row<n){
                val++;
                num+=2;
                space--;
            }
            else{
                val--;
                num-=2;
                space++;
            }
            row++;
            System.out.println("");
        }

    }
}
