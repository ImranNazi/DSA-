
package basicsProg;


public class ReverseArray {
    public static void main(String[] args) {
         int [] x={1,2,3,4,5};
            rev(x);
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" ");
            }
    }
    public static void rev(int [] x) {
        int i=0,j=x.length-1,temp;
        while(i<j){
            temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;
        }
    }
}
