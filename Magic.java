import java.util.*;
public class Magic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the odd dimension : ");
        int dim = sc.nextInt();
        int k = 1;
        int matrix[][] = new int[dim][dim];
        int cr = 0, cc = dim/2;
        matrix[cr][cc] = k++;
        while(k <= dim * dim)
        {
            int pr = cr, pc = cc;
            
            cr--;
            if(cr == -1)
                cr = dim - 1;
            
            cc++;
            if(cc == dim)
                cc = 0;
            
            if(matrix[cr][cc] != 0)
            {
                cc = pc;
                cr = pr + 1;
            }
            matrix[cr][cc] = k++;
        }
        sc.close();

        System.out.println("\nMagic Square for dimension " + dim + " x " + dim);
        System.out.println();
        int sum = 0;
        for(int i = 0; i < dim; i++)
        {
            sum += matrix[i][0];
            for(int j = 0; j < dim; j++)
                System.out.printf("%4d", matrix[i][j]);
            System.out.println();
        }
        System.out.println("Sum of all the rows, columns and diagonals are : " + sum);
        System.out.println();
    }
    
}
