
package Practice;


public class NewClass8 {
    public static void main(String[] args) {
        //linear search 
       int []x={12,34,9,5,7,21};
       int item=7;
        System.out.println(Search(x,item));
    }
    public static int Search(int [] x,int item) {
        for(int i=0;i<x.length;i++){
            if(x[i]==item){
                return i;
            }
        }
        return -1;
    }
}
