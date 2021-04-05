package gcettb;

/**
 * Question: <BR>
 *      What will be the output of this script or the main method declared in this class ?? <BR>
 *      Also describe all possible error in this code, if any ( both Ethical and Syntactic )
 */

public class Q2 {

    public static void main(String[] args) {
        Q2 q2 = new Q2(n);
    }

    static int a = 10;
    static int n;
    int b = 5;
    int c;

    public Q2(int m) {
        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }

    // Instance Block
    {
        b = 30;
        n = 20;
    }

    // Static Block
    static
    {
        a = 60;
    }
}
