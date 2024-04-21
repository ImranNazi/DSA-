
package nazi;
import java.util.*;


public class Pattern13 {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int n=kb.nextInt();
       int row=1,space=n-1,val=1,num=1;
       while(row<=n){
           //space
           int i=0;
           while(i<space){
               System.out.print("\t");
               i++;
           }
           //num
           int j=0;
           while(j<num){
               System.out.print(val+"\t");
               j++;
               val++;
           }
           //mirror
           row++;
           space--;
           num+=2;
           System.out.println("");
       }
    }
}
