package Recursion;

import java.util.Scanner;

public class recur6 {
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of number " + n + " is : " + fact(n));
        sc.close();
    }
}
