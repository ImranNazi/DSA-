
package Practice;


public class NewClass12 {
    public static void main(String[] args) {
        int [] a={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainWaterTrap(a));
    }
    public static int rainWaterTrap(int [] a) {
        //left max
        int n=a.length,sum=0;
        int [] left=new int [n];
        left[0]=a[0];
        for(int i=1;i<a.length;i++){
            left[i]=Math.max(left[i-1], a[i]);
        }
        //right max
        int [] right=new int [n];
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1], a[i]);

        }
        //sum
        for(int i=0;i<a.length;i++){
            sum+=Math.min(left[i], right[i])-a[i];
          }
        return sum;
    }
}
