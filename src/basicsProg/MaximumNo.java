
package basicsProg;

public class MaximumNo {
      public static void main(String[] args) {
        int [] x={12,34,56,2};
        System.out.println(MaxFind(x)); 
    }
    public static int MaxFind(int []x) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++){
            max=Math.max(x[i], max);
        }
        return max;
    }
}
