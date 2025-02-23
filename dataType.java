//program 1
class Sample1 
{
    public static void main(String[] args)
    {
        int i = 20;
        byte b = i; // error - downcasting(possible lossy conversion from int to byte)
        System.out.println(b);
    }
}

//program 2 // up-casting allowed in java
class Sample2
{
    public static void main(String[] args)
    {
        byte b = 20;
        int i = b; // up-casting allowed in java
        System.out.println(i);
    }
}

//program 3 
class Sample3
{
    public static void main(String[] args)
    {
        int i = 100;
        byte b = (byte)i; // explicit type casting in java to avoid downcasting error
        System.out.println(b);
    }
}

//program 4
class Sample4
{
    public static void main(String[] args)
    {
        int i = 129; // 127 + 1 + 1
        byte b = (byte)i;
        System.out.println(b);
    }
}

class Sample5
{
    public static void main(String[] args)
    {
        int i = 255; // 127 + 1 + 127
        byte b = (byte)i;
        System.out.println(b);
    }
}

class Sample6
{
    public static void main(String[] args)
    {
        int a = 100,  b = 200;
        System.out.println("a + b = " + (a + b));
    }
}

class Sample7
{
    public static void main(String[] args)
    {
        System.out.println("\u092D\u093E\u0930\u0924");
    }
}

class Sample8
{
    public static void main(String[] args)
    {
        String color = "\u001B[35m"; // purple color
        String reset = "\u001B[0m";
        System.out.println(color + "\u092D\u093E\u0930\u0924" + reset);
    }
}

class Sample9
{
    public static void main(String args[])
    {
        int val = 'A' + 65; // character constant and integer constant are interchangeable
        System.out.println(val);
    }
}

class Sample10
{
    public static void main(String[] args)
    {
        char val = 65; // character constant and integer constant are interchangeable
        System.out.println(val);
    }
}

class Sample11
{
    public static void main(String[] args)
    {
        char a = 2349;
        char b = 2366;
        char c = 2352;
        char d = 2340;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Sample12
{
    public static void main(String[] args)
    {
        char a = 42;
        char b = 43;
        System.out.println((char)(a + b));
    }
}