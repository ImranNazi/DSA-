
package Practice;
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
          Scanner kb=new Scanner(System.in);
          int n=kb.nextInt(),row=1,star=1,space1=n/2+1,space2=-1;
          while(row<=n){
              //space1
              int i=0;
              while(i<space1){
                  System.out.print(" ");
                  i++;
                 }
              //star
              System.out.print("* ");
              //space2
           int k=0;
           while(k<space2){
               System.out.print(" ");
               k++;
           }
           //star
           if(row>1 && row<n){
              System.out.print("* ");
           }
           //mirroring
           if(row<=n/2){
               space1--;
               space2+=2;
           }
           else{
               space1++;
               space2-=2;
           }
           row++;
              System.out.println("");
       }
          
    }
}
