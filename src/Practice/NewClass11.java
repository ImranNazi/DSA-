
package Practice;



public class NewClass11 {
    public static void main(String[] args) {
       
        int [] a={1,2,3,4,5,6,7};
        int k=3;
        sort(a,k);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int [] a,int k) {
        int n=a.length;
        k=k%7;
        swap(a,0,n-k-1);//0-3
        swap(a,n-k,n-1);//4-6
        swap(a,0,n-1);
    }
        public static void swap(int [] a,int x,int y) {
            
            while(x<=y){
                int temp=a[x];
                a[x]=a[y];
                a[y]=temp;
                x++;
                y--;
            }
        }

}
