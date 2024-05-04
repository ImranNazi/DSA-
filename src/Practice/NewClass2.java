
package Practice;
import java.util.Scanner;


public class NewClass2 {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int n=kb.nextInt(),row=1,star=n/2+1,space=-1;
       while(row<=n){
           //star
           int i=0;
           while(i<star){
               
               System.out.print("* ");
               i++;
            }
           //space
           int k=0;
           while(k<space){
               System.out.print("  ");
               k++;
               
           }
           //star
           int l=0;
           if(row==1 || row==n){
               l=1;
           }
              while(l<star){
                  
               System.out.print("* ");
               l++;
            }
           
           
           //mirroring
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
