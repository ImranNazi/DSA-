
package nazi;

import java.util.Scanner;


public class Pattern3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int row=0;
        while(row<n){
          int star=0;
          while(star<row){
              System.out.print("* ");
              star++;
              
          }
            System.out.println("");
            row++;
        }
    }
}
