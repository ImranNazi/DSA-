
package basicsProg;


public class firstBadVersion {
    public static void main(String[] args) {
        firstBad();
    }
    public static int firstBad() {
        int lo=1,hi=100,ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isbad(mid)==true){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    private static boolean isbad(int mid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
