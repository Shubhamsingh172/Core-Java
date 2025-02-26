import java.util.Scanner;

class Demo
{
    public static void main(String ...s)
    {
        int i = 1, j;
        while(i <= 5)
        {
            j = 1;
            while(j <= 5)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

class LoopDemo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scanner.nextInt(); 
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i -= -1;
        }       
        scanner.close();
    }
}

class LoopDemo2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = num;
            while(j >= i)
            {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}

class LoopDemo3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = 1;
            while(j <= num + 1 - i)
            {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}

class LoopDemo4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = num;
            while(j >= num + 1 - i)
            {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}

class LoopDemo5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        int k = 1;
        while(i <= num)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print(k++ + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}

class LoopDemo6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = i;
            while(j >= i / i)
            {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}

class LoopDemo7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = 1;
            while(j <= num * 2 - 2 * i)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= i * 2 - 1)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        scanner.close();
    }
}

class LoopDemo8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = 1;
            while(j <= num * 2 - 2 * i)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= i * 2 - 1)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        int ii = 1;
        while(ii <= num - 1)
        {
            int j = 1;
            while(j <= ii * 2)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= (num - 1) * 2 - (ii * 2 - 1))
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            ii++;
        }
        scanner.close();
    }
}


//only based on the row 
class LoopDemo9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num / 2 + 1)
        {
            int j = 1;
            while(j <= (num / 2 + 1) * 2 - (2 * i - 1))
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= i * 2 - 1)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        int ii = 1;
        while(ii <= num / 2)
        {
            int j = 1;
            while(j <= ii * 2 + 1)
            {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= (num / 2) * 2 - (ii * 2 - 1))
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            ii++;
        }
        scanner.close();
    }
}

// 4 loop diamond only in java

class LoopDemo10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num / 2 + 1)
        {
            int j = 1;
            while(j <= (num / 2 + 1) * 2)
            {
                if(j <= (num / 2 + 1) * 2 - (i * 2 - 1))
                    System.out.print(" ");
                else
                    System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        int ii = 1;
        while(ii <= num / 2)
        {
            int j = 1;
            while(j <= (num / 2 + 1) * 2)
            {
                if(j <= ii * 2 + 1)
                    System.out.print(" ");
                else
                    System.out.print("* ");
                j++;
            }
            System.out.println();
            ii++;
        }
        scanner.close();
    }
}
class LoopDemo11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num)
        {
            int j = 1;
            while(j <= (num / 2 + 1) * 2)
            {
                if(i <= num / 2)
                {
                    if(j <= (n / 2 + 1) * 2 - (i * 2 - 1))
                        System.out.println(" ");
                    else
                        System.out.println("* ");
                }
                else
                {
                    if(j <= )
                }
            }
            System.out.println();
            i++;
        }
        scanner.close();
    }
}