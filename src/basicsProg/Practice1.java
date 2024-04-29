
package basicsProg;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
           Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int star=1,space=n-1,row=0;
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
                System.out.print("* ");
                j++;
            }
            //upd
            row++;
            star+=2;
            space--;
            System.out.println("");
        }
    }
}
