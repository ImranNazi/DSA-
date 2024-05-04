
package Practice;
import java.util.Scanner;


public class NewClass6 {
    public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
         int n=kb.nextInt(),row=1,star=1;
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
