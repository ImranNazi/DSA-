
package basicsProg;


public class BinarySearch {
    //sorted array
    public static void main(String[] args) {
        int [] a={2,3,5,7,8,9,11,12,13,18};
        int item=-1;
        System.out.println(search(a,item));
    }
    public static int search(int [] a,int item) {
        int lo=0,hi=a.length-1;
        while(lo<=hi){
        int mid=(lo+hi)/2;
        if(a[mid]==item)
            return mid;
        else if(a[mid]>item){
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
     }
        return -1;
    }
}
