public class StaticDemo
{
    static int static_x = 10;
    int non_static_x = 20;

    static void staticMethod()
    {
        System.out.println("Static_x = " + static_x);
        StaticDemo obj = new StaticDemo();
        System.out.println("non_static_x = " + obj.non_static_x);
    }

    void nonStaticMethod()
    {
        System.out.println("Static_x = " + static_x);
        System.out.println("non_static_x = " + non_static_x);
        staticMethod();
    }
    public static void main(String[] args)
    {
        staticMethod();
        StaticDemo ob = new StaticDemo();
        ob.nonStaticMethod();
    }   
}
