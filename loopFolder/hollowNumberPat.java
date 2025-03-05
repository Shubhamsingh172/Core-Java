package loopFolder;
import java.util.*;
public class hollowNumberPat 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        for(int i = 1, spaces = 1; i <= rows * 2 - 1;)
        {
            if(i <= rows)
            {
                if(spaces == rows - i + 1 || rows * 2 - spaces == rows - i + 1)
                {
                    System.out.print(i + " ");
                    spaces++;
                }
                else
                {
                    System.out.print( "  ");
                    spaces++;
                }
                if(spaces > rows * 2 - 1)
                {
                    System.out.println();
                    spaces = 1;
                    i++;
                }
            }
            else
            {
                if(spaces == i - rows + 1 || rows * 2 - spaces == i - rows + 1)
                {
                    System.out.print(rows * 2 - i + " ");
                    spaces++;
                }
                else
                {
                    System.out.print( "  ");
                    spaces++;
                }
                if(spaces > rows * 2 - 1)
                {
                    System.out.println();
                    spaces = 1;
                    i++;
                }
            }
            
        }
        sc.close();
    }
    
}
