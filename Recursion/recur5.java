package Recursion;

import java.util.Scanner;

public class recur5 {
    static int sumofNNatural(int n)
    {
        if(n <= 1)
            return 1;
        return n + sumofNNatural(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum of first " +  n + " natural number is : " + sumofNNatural(n));
        sc.close();
    }
}
