
package basicsProg;


public class TransposeArray {
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},
                  {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        display(a);
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[0].length;c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println("");
        }
    }
    public static void display(int [][] a) {
        //row
        for(int r=0;r<a.length;r++){
            //colomn
            for(int c=r+1;c<a[0].length;c++){
                int temp=a[r][c];
                a[r][c]=a[c][r];
                a[c][r]=temp;
            }
        }
        
    }
}
