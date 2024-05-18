
package basicsProg;


public class productExceptSelf {
    public static void main(String[] args) {
        int [] a={2,3,5,6,8};
       int [] ans= product(a);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] product(int [] a) {
        //left prod
        int n=a.length;
        int [] left=new int [n];
        left[0]=1;//assume it as 1 
        for(int i=1;i<a.length;i++){
            left[i]=left[i-1]*a[i-1];
        }
        //right prod
        int [] right=new int [n];
        right[n-1]=1;
          for(int i=n-2;i>=0;i--){
              right[i]=right[i+1]*a[i+1];
        }
          //left*right
                for(int i=0;i<a.length;i++){
                    left[i]=left[i]*right[i];
                    
                }
                return left;
    }
}
