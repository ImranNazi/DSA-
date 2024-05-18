
package basicsProg;


public class RainWaterTrapping {
    public static void main(String[] args) {
        int [] x={2,3,1,8,2,4,5};
        System.out.println(WaterTrap(x));
    }
    public static int WaterTrap(int [] x) {
        //left max
        int n=x.length,sum=0;
        int [] left=new int [n];//new array
        left[0]=x[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],x[i]);
        }
        
        //right max
        int [] right=new int[n];
        right[n-1]=x[n-1];
        for(int j=n-2;j>=0;j--){
            right[j]=Math.max(right[j+1], x[j]);
            System.out.println(right[j]);
        }
        for(int k=0;k<n;k++){
            sum+=Math.min(left[k],right[k])-x[k];
        }
        return sum;
    }
    
}
