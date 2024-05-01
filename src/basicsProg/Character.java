
package basicsProg;


public class Character {
    public static void main(String[] args) {
        char c='1',ch='B',x=(char) (c+ch);//must typecast explicitly as char cant store int values...
        
        System.out.println(x);
    }
}
