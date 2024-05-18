
package basicsProg;


public class Array2D {
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16},
                   {17,18,19,20}};
        display(a);
    }
    public static void display(int [][] a) {
        for(int col=0;col<a[0].length;col++){
            if(col%2==0){
                //row
                for(int row=0;row<a.length;row++){
                    System.out.print(a[row][col]+" ");
                }
            }
            else{
                 for(int row=a.length-1;row>=0;row--){
                     System.out.print(a[row][col]+" ");
                 }

            }
        }
    }
}
