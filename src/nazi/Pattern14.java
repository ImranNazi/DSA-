
package nazi;
import java.util.*;


public class Pattern14 {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int n=kb.nextInt();
       int space=n-1,num=1,row=1;
       while(row<=n){
           //space
           int i=0;
           while(i<space){
               System.out.print("  ");
               i++;
           }
           //num 
           int j=0,val=1;
           
           while(j<num){
               System.out.print(val+" ");
                 if(j<num/2){
                   val++;
  
                 }
                 else{
                     val--;
                 }
               j++;
           }
           row++;
           num+=2;
           space--;
           System.out.println("");
       }
    }
}
