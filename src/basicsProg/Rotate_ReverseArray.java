
package basicsProg;


public class Rotate_ReverseArray {
     public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
}
     public static void rotate(int [] a,int k) {
         int n=a.length;
         k=k%n;//to depict how many rotation it will complete
        reverse(a,0,n-k-1);//0-3
        reverse(a,n-k,n-1);//4-6
        reverse(a,0,n-1);//0-6

        
    }
     public static void reverse(int [] a,int i,int j) {
         while(i<=j){
             int temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             i++;
             j--;
         }
     }
}