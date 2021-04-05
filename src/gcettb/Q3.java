package gcettb;

/**
 * Question:<BR>
 *     What does the expression <B> float a = 35 / 0 </B> return ?? <BR>
 *         a> 0     <BR>
 *         b> Not a Number     <BR>
 *         c> Infinity      <BR>
 *         d> Run time exception
 */

public class Q3 {

    public static void main(String[] args) {
        float a = 35 / 0;
        System.out.println(a);
    }
}
