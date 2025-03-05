package loopFolder;
import java.util.*;

class OneLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the odd number of rows : ");
        int rows = sc.nextInt();
        for(int i = 1, j = 1; i <= rows;)
        {
            if(i <= rows / 2 + 1)
            {
                if(j <= (rows / 2 + 1) * 2 - i * 2 + 1)
                {
                    System.out.print(" ");
                    j++;
                }
                else 
                {
                    System.out.print("* ");
                    j++;
                }
                if(j > (rows / 2 + 1) * 2)
                {
                    System.out.println();
                    j = 1;
                    i++;
                }
            }
            else
            {
                if(j <= i * 2 - rows)
                {
                    System.out.print(" ");
                    j++;
                }
                else 
                {
                    System.out.print("* ");
                    j++;
                }
                if(j > (rows / 2 + 1) * 2)
                {
                    System.out.println();
                    j = 1;
                    i++;
                }
            }
        }
        sc.close();
    }
}