
package Practice;

import java.util.Scanner;

public class NewClass4 {
    public static void main(String[] args) {
        //5/9-f*32
           Scanner kb=new Scanner(System.in);
           int minf=kb.nextInt(),maxf=kb.nextInt(),step=20;
           for(int i=minf;i<=maxf;i+=20){
               int c=(int)((5.0/9)*(i-32));
               System.out.println(i+" "+c);
           }
    }
}
