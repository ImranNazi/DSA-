
package Practice;

import java.util.Scanner;


public class Eg1 {
    public static void main(String[] args) {
      // dec to bin
      Scanner kb=new Scanner(System.in);
      int n=kb.nextInt();
      int mul=1,sum=0;
      while(n>0){
          int rem=n%2;
          sum+=rem*mul;
          mul*=10;
          n/=2;
      }
        System.out.println(sum+" ");
        
    }
}
