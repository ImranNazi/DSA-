
package Practice;


public class NewClass7 {
    public static void main(String[] args) {
        //max array
        int [] a={2,34,76,543,5};
        System.out.println(Find(a));
    }
    public static int Find(int [] a) {
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
                    return max;

    }
}
