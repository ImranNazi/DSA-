
package nazi;
import java.util.*;


public class Pattern7 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int space=n-1,star=1,row=0;
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
                   if(j%2!=0){//0%2=0
                       System.out.print("! ");
                   }
                   else{
                   System.out.print("* ");
                   }
                   j++;
        }
               space--;
               star+=2;
               row++;
               System.out.println("");
               
    }
}
}