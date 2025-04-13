package Recursion;

public class recur4 {
    static void sum(int n)
    {
        System.out.print(n + " ");
        if(n != 5)
            sum(n + 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        sum(1);
        System.out.println();
    }
}
