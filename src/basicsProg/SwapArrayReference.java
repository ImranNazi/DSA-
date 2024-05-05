
package basicsProg;


public class SwapArrayReference {
    public static void main(String[] args) {
        int [] a={10,23,34};
        int [] b={20,2,37};
        System.out.println(a[0]+""+b[0]);
        Swap(a,b);
        System.out.println(a[0]+""+b[0]);

    }
    public static void Swap(int []a,int [] b) {
        int[] temp=a;
        a=b;
        b=temp;
        
    }
}
