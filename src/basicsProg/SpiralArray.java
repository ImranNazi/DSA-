
package basicsProg;


public class SpiralArray {
    public static void main(String[] args) {
        int [] [] x={{1,2,3,4},
                    {5,6,7,8},
                    {10,11,12,13},
                    {14,15,16,17},
                    {18,19,20,21}};
        display(x);
    }
    public static void display(int [][] a) {
        int minR=0,minC=0,maxR=a.length,maxC=a[0].length;
        int count=0,total_element=a.length*a[0].length;
        while(count<total_element){
        //first
        for(int i=minC;i<maxC;i++){
            System.out.print(a[minR][i]+" ");
            count++;
        }
        minR++;
        for(int j=minR;j<maxR;j++){
              System.out.print(a[j][maxC-1]+" ");
                          count++;

        }
        maxC-=2;
//        System.out.println(maxC);
       // 20-18
        for(int k=maxC;k>=0;k--){
              System.out.print(a[maxR-1][k]+" ");
            count++;

        }
        maxR-=2;
        //14-5
        for(int i=maxR;i>=minR;i--){
            System.out.print(a[i][minC]+" ");
                        count++;

        }
        minC++;
        //6-7
        for(int i=minC;i<=maxC;i++){
            System.out.print(a[minR][i]+" ");
                        count++;

        }
        minR++;
        //12-16
         for(int i=minR;i<=maxR;i++){
            System.out.print(a[i][maxC]+" ");
                        count++;

        }
         maxC--;
         //15-11
          for(int i=maxR;i>=minR;i--){
            System.out.print(a[i][maxC]+" ");
                        count++;

        }
        
    }
    }
}
