
package Practice;


public class NewClass16 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rotate(int [] a,int k) {
        k=k%7;
        int n=a.length;
       reverse(a,0,n-k-1);//0-3
       reverse(a,n-k,n-1);//4-6
       reverse(a,0,n-1);//0-3

}
    public static void reverse(int [] a,int x, int y) {
        while(x<y){
            int temp=a[x];
            a[x]=a[y];
            a[y]=temp;
            x++;
            y--;
        }
    }
}