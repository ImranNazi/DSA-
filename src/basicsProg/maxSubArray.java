
package basicsProg;


public class maxSubArray {
    public static void main(String[] args) {
        int [] a={-2,-3,-1,-4};
        System.out.println(maximum(a));
    }
    public static int maximum(int [] a) {
        int sum=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            ans=Math.max(sum,ans);
            if(sum<0)//if sum is -ve
                sum=0;
            
        }
        return ans;
    }
}
