package Recursion;

public class recur3 {
    static int three(int x)
    {
        return x * 4;
    }
    static int two(int x)
    {
        return three(x + 2) * 3;
    }
    static int one(int x)
    {
        return two(x + 1) * 2;
    }
    public static void main(String[] args) {
        System.out.println(one(5));
    }
}
