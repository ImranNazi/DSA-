
package Practice;


public class InverseValue {
    public static void main(String[] args) {
        int n=32145,pos=1,sum=0;
        while(n>0){
            int rem=n%10;
            sum+=pos*Math.pow(10, rem-1);
            n/=10;
            pos++;
        }
        System.out.println(sum+" ");
    }
}
