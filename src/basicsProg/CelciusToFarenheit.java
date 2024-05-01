
package basicsProg;

import java.util.Scanner;


public class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int minF=kb.nextInt();
        int maxF=kb.nextInt(),step=kb.nextInt();
        for(int i=minF;i<=maxF;i+=step){
            int c=(int)((5.0/9)*(i-32));//i is minF...
            System.out.println(i+"\t"+c);
        }
        
    }
}
