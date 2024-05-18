
package basicsProg;


public class BubbleSortArray {
    public static void main(String[] args) {
        int [] a={5,4,-3,2,1};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void sort(int [] a) {
        for(int turn=1;turn<a.length;turn++){
            
            for(int i=0;i<a.length-turn;i++){
                //swapping
                if(a[i]>a[i+1]){
                 int temp=a[i];
                 a[i]=a[i+1];
                 a[i+1]=temp;

                }
            }
        }
    }
}
