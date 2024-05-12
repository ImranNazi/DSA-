
package basicsProg;


public class RotateArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        int k=3;//no. of rotation
        rot(a,k);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rot(int [] a,int k) {
        k=k%7;
        int n=a.length;
        for(int j=1;j<=k;j++){
        int last_elem=a[a.length-1];
        for(int i=n-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=last_elem;
        }
    }
}
