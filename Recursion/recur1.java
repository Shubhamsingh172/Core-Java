package Recursion;

public class recur1 {
    static void three()
    {
        System.out.println("Entering three()");
        System.out.println("Exiting three()");
    }
    static void two()
    {
        System.out.println("Entering two()");
        three();
        System.out.println("Exiting two()");
    }
    static void one()
    {
        System.out.println("Entering one()");
        two();
        System.out.println("Exiting one()");
    }
    public static void main(String[] args) {
        System.out.println("Entering main()");
        one();
        System.out.println("Exiting main()");
    }
}
