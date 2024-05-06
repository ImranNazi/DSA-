
package basicsProg;


public class MaximumNoFind {
    public static void main(String[] args) {
        int [] x={12,34,56,2};
        System.out.println(MaxFind(x)); 
    }
    public static int MaxFind(int []x) {
        int max=x[0];//lets assume index 0 is max.
        for(int i=1;i<x.length;i++){
            if(x[i]>max)
                max=x[i];
        }
        return max;
    }
 
}
