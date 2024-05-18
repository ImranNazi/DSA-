
package Practice;


public class NewClass13 {
    public static void main(String[] args) {
        //insertion sort
        int [] a={3,5,2,4,6};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int [] a) {
        //start from i=1, as index =0 is sorted
        for(int i=1;i<a.length;i++){
            int j=i-1,picked=a[i];
            while(j>=0 && a[j]>picked){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=picked;
        }
    }
}
