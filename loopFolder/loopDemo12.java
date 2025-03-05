package loopFolder;
import java.util.*;

class loopDemo12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int matrix[][] = new int[21][21];
        System.out.print("Enter the odd number dimensions for spiral matrix : ");
        int number = scanner.nextInt();
        int k = 1;
        for(int iter = 0; iter < number / 2 + 1; iter++)
        {
            for(int j = iter; j <= number - 1 - iter; j++)
                matrix[iter][j] = k++;

            for(int j = iter + 1; j <= number - 1 - iter; j++)
                matrix[j][number - 1 - iter] = k++;

            for(int j = number - 2 - iter; j >= iter; j--)
                matrix[number - 1 - iter][j] = k++;

            for(int j = number - 2 - iter; j > iter; j--)
                matrix[j][iter] = k++;
        }

        System.out.println("\nSpiral Matrix is : ");
        for(int i = 0; i < number; i++)
        {
            for(int j = 0; j < number; j++)
                System.out.printf("%4d",matrix[i][j]);
            System.out.println();
        }
        scanner.close();
    }
}