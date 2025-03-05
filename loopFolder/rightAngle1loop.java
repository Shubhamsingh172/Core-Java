package loopFolder;
import java.util.*;
public class rightAngle1loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = sc.nextInt();
        for(int i = 1, spaces = 1; i <= rows;)
        {
            if(spaces <= i)
            {
                System.out.print(spaces + " ");
                spaces++;
            }
            else
            {
                System.out.println();
                spaces = 1;
                i++;
            }
        }
        sc.close();
    }
}
