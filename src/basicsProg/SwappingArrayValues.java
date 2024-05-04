
package basicsProg;


public class SwappingArrayValues {
    public static void main(String[] args) {
      int []x={10,23,34};
      Swap(x,0,1);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]+" ");
        }
      
    }
    public static void Swap(int [] x,int a,int b) {
        int temp=x[a];
        x[a]=x[b];
        x[b]=temp;
        
    }
}
