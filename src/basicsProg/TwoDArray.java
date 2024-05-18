
package basicsProg;

import java.util.Scanner;


public class TwoDArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt(),y=kb.nextInt();
        int [][]a=new int [x][y];
        //row
        for(int i=0;i<a.length;i++){
            //column
            for(int j=0;j<a[i].length;j++){
                a[i][j]=kb.nextInt();
            }
            
        }
        display(a);
    }
    public static void display(int [][] a) {
         //row
        for(int i=0;i<a.length;i++){
            //column
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
