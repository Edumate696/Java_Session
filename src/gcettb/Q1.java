package gcettb;

/**
 * Question: <BR>
 *      What will be the output of this script or the main method declared in this class ?? <BR>
 *      Also describe all possible error in this code, if any ( both Ethical and Syntactic )
 */

public class Q1 {

    public void myMethod() {
        System.out.println("Method");
    }

    {
        System.out.println("Instance Block");
    }

    public void Q1() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.Q1();
        q1.myMethod();
    }
}
