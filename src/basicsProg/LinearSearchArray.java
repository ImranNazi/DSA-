
package basicsProg;


public class LinearSearchArray {
    public static void main(String[] args) {
        int [] x={21,32,4,56};
        int item=4;
        System.out.println();
    }
    public static int Find(int [] x,int item) {
        for(int i=0;i<x.length;i++){
            if(x[i]==item){
                return i;//returns index value where item is present...
            }
            //if we write else here , we get it wrong as when checking for 0 index if value is not present -1 will be returned ...
        }
           return -1;
    }
}
