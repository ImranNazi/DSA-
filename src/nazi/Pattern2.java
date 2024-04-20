
package nazi;

import java.util.Scanner;


public class Pattern2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int row=0;
        while(row<n){
            int star=0;
            //to print star..
            while(star<n){
            System.out.print("* ");
            star++;
            }
            row++;
            System.out.println("");
        }
    }
}
